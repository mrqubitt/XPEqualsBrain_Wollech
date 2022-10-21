
package net.mcreator.xpequalsbrain.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.monster.RangedAttackMob;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.goal.RangedAttackGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.xpequalsbrain.procedures.KotuBuyucuItIsStruckByLightningProcedure;
import net.mcreator.xpequalsbrain.procedures.KotuBuyucuEntityIsHurtProcedure;
import net.mcreator.xpequalsbrain.procedures.KotuBuyucuEntityDiesProcedure;
import net.mcreator.xpequalsbrain.procedures.BuyucuOnEntityTickUpdateProcedure;
import net.mcreator.xpequalsbrain.init.XpequalsbrainModEntities;

public class KotuBuyucuEntity extends Monster implements RangedAttackMob {
	public KotuBuyucuEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(XpequalsbrainModEntities.KOTU_BUYUCU.get(), world);
	}

	public KotuBuyucuEntity(EntityType<KotuBuyucuEntity> type, Level world) {
		super(type, world);
		xpReward = 0;
		setNoAi(false);
		setCustomName(new TextComponent("Şatonun Bekçisi"));
		setCustomNameVisible(true);
		setPersistenceRequired();
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.targetSelector.addGoal(1, new NearestAttackableTargetGoal(this, Player.class, false, false));
		this.goalSelector.addGoal(2, new LookAtPlayerGoal(this, Player.class, (float) 6));
		this.goalSelector.addGoal(3, new MeleeAttackGoal(this, 1.2, false) {
			@Override
			protected double getAttackReachSqr(LivingEntity entity) {
				return (double) (4.0 + entity.getBbWidth() * entity.getBbWidth());
			}
		});
		this.goalSelector.addGoal(4, new RandomStrollGoal(this, 0.8));
		this.goalSelector.addGoal(1, new RangedAttackGoal(this, 1.25, 20, 10) {
			@Override
			public boolean canContinueToUse() {
				return this.canUse();
			}
		});
	}

	@Override
	public MobType getMobType() {
		return MobType.UNDEFINED;
	}

	@Override
	public boolean removeWhenFarAway(double distanceToClosestPlayer) {
		return false;
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.death"));
	}

	@Override
	public void thunderHit(ServerLevel serverWorld, LightningBolt lightningBolt) {
		super.thunderHit(serverWorld, lightningBolt);
		KotuBuyucuItIsStruckByLightningProcedure.execute(this.level, this.getX(), this.getY(), this.getZ());
	}

	@Override
	public boolean hurt(DamageSource source, float amount) {
		KotuBuyucuEntityIsHurtProcedure.execute(this.level, this.getX(), this.getY(), this.getZ());
		if (source == DamageSource.FALL)
			return false;
		if (source == DamageSource.DROWN)
			return false;
		return super.hurt(source, amount);
	}

	@Override
	public void die(DamageSource source) {
		super.die(source);
		KotuBuyucuEntityDiesProcedure.execute(this.level, this.getX(), this.getY(), this.getZ(), source.getEntity());
	}

	@Override
	public void baseTick() {
		super.baseTick();
		BuyucuOnEntityTickUpdateProcedure.execute(this.level, this.getX(), this.getY(), this.getZ(), this);
	}

	@Override
	public void performRangedAttack(LivingEntity target, float flval) {
		FireballEntity.shoot(this, target);
	}

	public void aiStep() {
		super.aiStep();
		double x = this.getX();
		double y = this.getY();
		double z = this.getZ();
		Entity entity = this;
		Level world = this.level;
		for (int l = 0; l < 50; ++l) {
			double x0 = x + 0.5 + (random.nextFloat() - 0.5) * 2D;
			double y0 = y + 1.2 + (random.nextFloat() - 0.5) * 2D * 100;
			double z0 = z + 0.5 + (random.nextFloat() - 0.5) * 2D;
			world.addParticle(ParticleTypes.SOUL, x0, y0, z0, 0, 0, 0);
		}
	}

	public static void init() {
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.3);
		builder = builder.add(Attributes.MAX_HEALTH, 200);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 3);
		builder = builder.add(Attributes.FOLLOW_RANGE, 16);
		builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 2);
		builder = builder.add(Attributes.ATTACK_KNOCKBACK, 2);
		return builder;
	}
}
