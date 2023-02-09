package it.finnsolly;

public class CustomWeapon extends CustomItem {

    private int maxItemLevel;
    private String itemClass;
    private int rarity;
    private int attack;

    private int magicAttack;
    private int defense;
    private int magicDefense;
    private int requiredBaseStrength;
    private int requiredBaseDexterity;
    private int requiredBaseIntelligence;
    private int requiredBaseWisdom;
    private int strength;
    private int dexterity;
    private int intelligence;
    private int wisdom;
    private int accuracy;
    private int criticalRate;
    private int addedHealth;
    private int addedMana;
    private float dropRate;
    private boolean tradable;
    private int attackSpeed;
    private String weaponType;

    public CustomWeapon(String displayName, String itemID, int itemRank, String itemClass, String itemLore, int maxItemLevel, int rarity, int attack, int magicAttack, int defense, int magicDefense, int requiredBaseStrength, int requiredBaseDexterity, int requiredBaseIntelligence, int requiredBaseWisdom, int strength, int dexterity, int intelligence, int wisdom, int accuracy, int criticalRate, int addedHealth, int addedMana, float dropRate, boolean tradable, int attackSpeed, String weaponType) {
        super(displayName, itemID, itemRank, itemClass, itemLore);
        this.maxItemLevel = maxItemLevel;
        this.rarity = rarity;
        this.attack = attack;
        this.magicAttack = magicAttack;
        this.defense = defense;
        this.magicDefense = magicDefense;
        this.requiredBaseStrength = requiredBaseStrength;
        this.requiredBaseDexterity = requiredBaseDexterity;
        this.requiredBaseIntelligence = requiredBaseIntelligence;
        this.requiredBaseWisdom = requiredBaseWisdom;
        this.strength = strength;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.accuracy = accuracy;
        this.criticalRate = criticalRate;
        this.addedHealth = addedHealth;
        this.addedMana = addedMana;
        this.dropRate = dropRate;
        this.tradable = tradable;
        this.attackSpeed = attackSpeed;
        this.weaponType = weaponType;
    }
}
