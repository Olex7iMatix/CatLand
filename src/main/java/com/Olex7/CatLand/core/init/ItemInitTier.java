package com.Olex7.CatLand.core.init;

import com.google.common.base.Supplier;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

public enum ItemInitTier implements IItemTier {
	BRONZE(2, 300, 3f, 8f, 10, 
			() -> Ingredient.of(ItemInit.BRONZE.get()));

	private final int level;
	private final int uses;
	private final float speed;
	private final float damage;
	private final int enchantmentValue;
	private final LazyValue<Ingredient> repairIngredient;
	
	private ItemInitTier(int level, int uses, float speed, float damage, int enchantmentValue,
			Supplier<Ingredient> repairIngredient) {
		this.level = level;
		this.uses = uses;
		this.speed = speed;
		this.damage = damage;
		this.enchantmentValue = enchantmentValue;
		this.repairIngredient =  new LazyValue<>(repairIngredient);
	}

	@Override
	public int getUses() {return uses;}

	@Override
	public float getSpeed() {return speed;}

	@Override
	public float getAttackDamageBonus() {return damage;}

	@Override
	public int getLevel() {return level;}

	@Override
	public int getEnchantmentValue() {return enchantmentValue;}

	@Override
	public Ingredient getRepairIngredient() {return repairIngredient.get();}

}
