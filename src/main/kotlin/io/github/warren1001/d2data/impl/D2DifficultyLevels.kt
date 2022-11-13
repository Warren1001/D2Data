package io.github.warren1001.d2data.impl

import io.github.warren1001.d2data.D2Sheet
import io.github.warren1001.d2data.D2Sheets
import java.io.File

class D2DifficultyLevels(manager: D2Sheets, dir: File): D2Sheet(manager, dir, "difficultylevels") {
	
	companion object {
		
		private val HEADERS = listOf("Name", "ResistPenalty", "ResistPenaltyNonExpansion", "DeathExpPenalty", "MonsterSkillBonus", "MonsterFreezeDivisor", "MonsterColdDivisor", "AiCurseDivisor", "LifeStealDivisor", "ManaStealDivisor", "UniqueDamageBonus", "ChampionDamageBonus", "PlayerDamagePercentVSPlayer", "PlayerDamagePercentVSMercenary", "PlayerDamagePercentVSPrimeEvil", "PlayerHitReactBufferVSPlayer", "PlayerHitReactBufferVSMonster", "MercenaryDamagePercentVSPlayer", "MercenaryDamagePercentVSMercenary", "MercenaryDamagePercentVSBoss", "MercenaryMaxStunLength", "PrimeEvilDamagePercentVSPlayer", "PrimeEvilDamagePercentVSMercenary", "PrimeEvilDamagePercentVSPet", "PetDamagePercentVSPlayer", "MonsterCEDamagePercent", "MonsterFireEnchantExplosionDamagePercent", "StaticFieldMin", "GambleRare", "GambleSet", "GambleUnique", "GambleUber", "GambleUltra")
		
		const val NAME = "Name"
		const val RESIST_PENALTY = "ResistPenalty"
		const val RESIST_PENALTY_NON_EXPANSION = "ResistPenaltyNonExpansion"
		const val DEATH_EXP_PENALTY = "DeathExpPenalty"
		const val MONSTER_SKILL_BONUS = "MonsterSkillBonus"
		const val MONSTER_FREEZE_DIVISOR = "MonsterFreezeDivisor"
		const val MONSTER_COLD_DIVISOR = "MonsterColdDivisor"
		const val AI_CURSE_DIVISOR = "AiCurseDivisor"
		const val LIFE_STEAL_DIVISOR = "LifeStealDivisor"
		const val MANA_STEAL_DIVISOR = "ManaStealDivisor"
		const val UNIQUE_DAMAGE_BONUS = "UniqueDamageBonus"
		const val CHAMPION_DAMAGE_BONUS = "ChampionDamageBonus"
		const val PLAYER_DAMAGE_PERCENT_VS_PLAYER = "PlayerDamagePercentVSPlayer"
		const val PLAYER_DAMAGE_PERCENT_VS_MERCENARY = "PlayerDamagePercentVSMercenary"
		const val PLAYER_DAMAGE_PERCENT_VS_PRIME_EVIL = "PlayerDamagePercentVSPrimeEvil"
		const val PLAYER_HIT_REACT_BUFFER_VS_PLAYER = "PlayerHitReactBufferVSPlayer"
		const val PLAYER_HIT_REACT_BUFFER_VS_MONSTER = "PlayerHitReactBufferVSMonster"
		const val MERCENARY_DAMAGE_PERCENT_VS_PLAYER = "MercenaryDamagePercentVSPlayer"
		const val MERCENARY_DAMAGE_PERCENT_VS_MERCENARY = "MercenaryDamagePercentVSMercenary"
		const val MERCENARY_DAMAGE_PERCENT_VS_BOSS = "MercenaryDamagePercentVSBoss"
		const val MERCENARY_MAX_STUN_LENGTH = "MercenaryMaxStunLength"
		const val PRIME_EVIL_DAMAGE_PERCENT_VS_PLAYER = "PrimeEvilDamagePercentVSPlayer"
		const val PRIME_EVIL_DAMAGE_PERCENT_VS_MERCENARY = "PrimeEvilDamagePercentVSMercenary"
		const val PRIME_EVIL_DAMAGE_PERCENT_VS_PET = "PrimeEvilDamagePercentVSPet"
		const val PET_DAMAGE_PERCENT_VS_PLAYER = "PetDamagePercentVSPlayer"
		const val MONSTER_CE_DAMAGE_PERCENT = "MonsterCEDamagePercent"
		const val MONSTER_FIRE_ENCHANT_EXPLOSION_DAMAGE_PERCENT = "MonsterFireEnchantExplosionDamagePercent"
		const val STATIC_FIELD_MIN = "StaticFieldMin"
		const val GAMBLE_RARE = "GambleRare"
		const val GAMBLE_SET = "GambleSet"
		const val GAMBLE_UNIQUE = "GambleUnique"
		const val GAMBLE_UBER = "GambleUber"
		const val GAMBLE_ULTRA = "GambleUltra"
		
	}
	
	override fun getTrueHeaders() = HEADERS
	
}