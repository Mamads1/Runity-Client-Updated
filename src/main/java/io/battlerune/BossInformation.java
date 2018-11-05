package io.battlerune;

public enum BossInformation {

	KING_BLACK_DRAGON("King Black Dragon", 239, 276, 750, 25, "True", 2700, 46, -12, BossDrops.KBD_DROPS, 19),
	GIANT_MOLE("Giant Mole", 6499, 230, 1000, 20, "False", 2100, 52, -20, BossDrops.MOLE_DROPS, 16),
	LAVA_DRAGONS("Lava Dragons", 6593, 252, 650, 30, "True", 2600, 52, -20, BossDrops.LAVA_DRAGON_DROPS, 5),
	DAG_KINGS("Dagannoth Kings", 6497, 303, 750, 35, "False", 2100, 52, -8, BossDrops.DAG_KING_DROPS, 6),
	CORPOREAL_BEAST("Corporeal Beast", 319, 785, 3500, 50,  "False", 2100, 52, -20, BossDrops.CORP_BEAST_DROPS, 18),
	LIZARD_SHAMAN("Lizardman Shaman", 6766, 150, 750, 20,"False", 3700, 52, -5, BossDrops.LIZARD_SHAMAN_DROPS, 8),
	VETION("Vet'ion", 6611, 454, 750, 40,"True", 2400, 64, -10,  BossDrops.VETION_DROPS, 9),
	CHAOS_FANATIC("Chaos Fanatic", 6619, 202, 755, 20,  "True", 1600, 70, -10, BossDrops.FANATIC_DROPS, 18),
	CRAZY_ARCHAEOLOGIST("Crazy Archaeologist", 6618, 204, 755, 23,"True", 1600, 70, -10, BossDrops.ARCHAEOLOGIST_DROPS, 18),
	KRAKEN("Kraken", 494, 291, 750, 26, "False", 4000, 52, -15, BossDrops.KRAKEN_DROPS, 19),
	ZULRAH("Zulrah", 2042, 725, 500, 30,"False", 4500, 52, -25, BossDrops.ZULRAH_DROPS, 13),
	GODWARS("GodWars", 2215, 624, 1000, 40, "False",3700, 65, -10, BossDrops.GODWARS_DROPS, 14),
	CHAOS_ELEMENTAL("Chaos Elemental", 6505, 305, 750, 28, "True",2800, 52, 0, BossDrops.CHAOS_ELEMENTAL_DROPS, 18),
	GIANT_ROC("Giant Roc", 763, 172, 1000, 17,"True", 4200, 52, -10, BossDrops.GIANT_ROC_DROPS, 16),
	CALLISTO("Callisto", 6503, 470, 750, 30,"True", 2800, 52, -20, BossDrops.CALLISTO_DROPS, 18),
	SCORPIA("Scorpia", 6615, 225, 450, 32,"True", 2100, 60, -20, BossDrops.SCORPIA_DROPS, 17),
	CERBERUS("Cerberus", 5862, 318, 750, 42, "False",4200, 52, -20, BossDrops.CERBERUS_DROPS, 18),
	VORKATH("Vorkath", 8060, 392, 750, 90,"False", 5200, 52, -20, BossDrops.VORKATH_DROPS, 9),
	ICEDEMON("Ice Demon", 7585, 318, 650, 42,"False", 3500, 52, -20, BossDrops.ICEDEMON_DROPS, 5),
	PORAZDIR("Porazdir", 7860, 235, 750, 42,"True", 4000, 52, -20, BossDrops.PORAZDIR_DROPS, 5),
	TARN("Mutant Tarn", 6477, 693, 1200, 65,"False", 4000, 52, -20, BossDrops.MUTANT_TARN_DROPS, 9),

	;


	public final String name;
	public final int id;
	public final int cbLvl;
	public final int hp;
	public final int maxHit;
	public final String wildy;
	public final int zoom;
	public final int offsetX;
	public final int offsetY;
	public final int spriteId;
	public final int[][] loot;

	private BossInformation(String bossName, int npcId, int combatLevel, int hitpoints, int maxAttackDamage, String wildy,
			int modelZoom, int interfacePosX, int interfacePosY, int[][] drops, int teleportButtonSprite) {
		this.name = bossName;
		this.id = npcId;
		this.cbLvl = combatLevel;
		this.hp = hitpoints;
		this.maxHit = maxAttackDamage;
		this.wildy = wildy;
		this.zoom = modelZoom;
		this.offsetX = interfacePosX;
		this.offsetY = interfacePosY;
		this.loot = drops;
		this.spriteId = teleportButtonSprite;
	}

}
