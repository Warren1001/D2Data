package io.github.warren1001.d2data.enums.sheet

import io.github.warren1001.d2data.properSeparator

enum class D2DifficultyLevels(header: String, vararg headerHistory: String): D2Header {
	
	NAME("Name"),
	RESIST_PENALTY("ResistPenalty"),
	RESIST_PENALTY_NON_EXPANSION("ResistPenaltyNonExpansion"),
	DEATH_EXP_PENALTY("DeathExpPenalty"),
	MONSTER_SKILL_BONUS("MonsterSkillBonus"),
	MONSTER_FREEZE_DIVISOR("MonsterFreezeDivisor"),
	MONSTER_COLD_DIVISOR("MonsterColdDivisor"),
	AI_CURSE_DIVISOR("AiCurseDivisor"),
	LIFE_STEAL_DIVISOR("LifeStealDivisor"),
	MANA_STEAL_DIVISOR("ManaStealDivisor"),
	UNIQUE_DAMAGE_BONUS("UniqueDamageBonus"),
	CHAMPION_DAMAGE_BONUS("ChampionDamageBonus"),
	PLAYER_DAMAGE_PERCENT_VS_PLAYER("PlayerDamagePercentVSPlayer"),
	PLAYER_DAMAGE_PERCENT_VS_MERCENARY("PlayerDamagePercentVSMercenary"),
	PLAYER_DAMAGE_PERCENT_VS_PRIME_EVIL("PlayerDamagePercentVSPrimeEvil"),
	PLAYER_HIT_REACT_BUFFER_VS_PLAYER("PlayerHitReactBufferVSPlayer"),
	PLAYER_HIT_REACT_BUFFER_VS_MONSTER("PlayerHitReactBufferVSMonster"),
	MERCENARY_DAMAGE_PERCENT_VS_PLAYER("MercenaryDamagePercentVSPlayer"),
	MERCENARY_DAMAGE_PERCENT_VS_MERCENARY("MercenaryDamagePercentVSMercenary"),
	MERCENARY_DAMAGE_PERCENT_VS_BOSS("MercenaryDamagePercentVSBoss"),
	MERCENARY_MAX_STUN_LENGTH("MercenaryMaxStunLength"),
	PRIME_EVIL_DAMAGE_PERCENT_VS_PLAYER("PrimeEvilDamagePercentVSPlayer"),
	PRIME_EVIL_DAMAGE_PERCENT_VS_MERCENARY("PrimeEvilDamagePercentVSMercenary"),
	PRIME_EVIL_DAMAGE_PERCENT_VS_PET("PrimeEvilDamagePercentVSPet"),
	PET_DAMAGE_PERCENT_VS_PLAYER("PetDamagePercentVSPlayer"),
	MONSTER_CE_DAMAGE_PERCENT("MonsterCEDamagePercent"),
	MONSTER_FIRE_ENCHANT_EXPLOSION_DAMAGE_PERCENT("MonsterFireEnchantExplosionDamagePercent"),
	STATIC_FIELD_MIN("StaticFieldMin"),
	GAMBLE_RARE("GambleRare"),
	GAMBLE_SET("GambleSet"),
	GAMBLE_UNIQUE("GambleUnique"),
	GAMBLE_UBER("GambleUber"),
	GAMBLE_ULTRA("GambleUltra");
	
	override val headerHistory: List<String> = listOf(header, *headerHistory)
	
	companion object {
		val FILE_PATH = "data/global/excel/difficultylevels.txt".properSeparator()
		val HEADERS = values().map { it.headerHistory }
		val UNIQUE_HEADER = NAME
		const val HARDCODE = false
		
		val INFO = object: D2SheetInfo {
			override fun getFilePath() = FILE_PATH
			override fun getHeaders() = HEADERS
			override fun getUniqueHeader() = UNIQUE_HEADER
			override fun isHardcode() = HARDCODE
		}
	}
	
}