package com.kituri.tankmmdatabase.data.tank;

import com.kituri.app.data.Entry;

/**
 * 钢舞姬数据
 */
public class TankData extends Entry{

	private static final long serialVersionUID = 3672726097211956879L;
	

//	public static final String EQUIPMENT_SLOTS[] = {"炮座", "改装", "外身", "内舱", "内壁", "炮架", "特殊"};
//	
	

	
//	public static final int TANK_ALL = -1;
//	public static final int TANK_TYPE = 0;
//	public static final int TANK_CLASS = 1;
//	public static final int TANK_NAME = 2;
//	public static final int TANK_NATIONALITY = 3;
//	public static final int TANK_STAR = 4;
//	public static final int TANK_FIRE = 5;
//	public static final int TANK_ARMOUR_PIERCING = 6;
//	public static final int TANK_HIT = 7;
//	public static final int TANK_DURABLE = 8;
//	public static final int TANK_ARMOUR = 9;
//	public static final int TANK_DODGE = 10;
//	public static final int TANK_HIDE = 11;
//	public static final int TANK_SPOT = 12;
//	public static final int TANK_EQUIPMENT_SLOTS = 13;
	
	private int tankType;
	private String tankClass;
	private String tankName;
	private String tankNationality;
	private int tankStar;
	private int tankFire;
	private int tankArmourPiercing;
	private int tankHit;
	private int tankDurable;
	private int tankArmour;
	private int tankDodge;
	private int tankHide;
	private int tankSpot;
	private int tankRange;
	private String tankEquipmentSlots;
	private String tankAcqierement;
	private String tankEngine;
	private String tankBodywork;
	//防护
	private String tankShield;
	//子弹
	private String tankBullet;
	
	public String getTankAcqierement() {
		return tankAcqierement;
	}
	public void setTankAcqierement(String tankAcqierement) {
		this.tankAcqierement = tankAcqierement;
	}
	public String getTankEngine() {
		return tankEngine;
	}
	public void setTankEngine(String tankEngine) {
		this.tankEngine = tankEngine;
	}
	public String getTankBodywork() {
		return tankBodywork;
	}
	public void setTankBodywork(String tankBodywork) {
		this.tankBodywork = tankBodywork;
	}
	public int getTankType() {
		return tankType;
	}
	public void setTankType(int tankType) {
		this.tankType = tankType;
	}
	public String getTankClass() {
		return tankClass;
	}
	public void setTankClass(String tankClass) {
		this.tankClass = tankClass;
	}
	public String getTankName() {
		return tankName;
	}
	public void setTankName(String tankName) {
		this.tankName = tankName;
	}
	public String getTankNationality() {
		return tankNationality;
	}
	public void setTankNationality(String tankNationality) {
		this.tankNationality = tankNationality;
	}
	public int getTankStar() {
		return tankStar;
	}
	public void setTankStar(int tankStar) {
		this.tankStar = tankStar;
	}
	public int getTankFire() {
		return tankFire;
	}
	public void setTankFire(int tankFire) {
		this.tankFire = tankFire;
	}
	public int getTankArmourPiercing() {
		return tankArmourPiercing;
	}
	public void setTankArmourPiercing(int tankArmourPiercing) {
		this.tankArmourPiercing = tankArmourPiercing;
	}
	public int getTankHit() {
		return tankHit;
	}
	public void setTankHit(int tankHit) {
		this.tankHit = tankHit;
	}
	public int getTankDurable() {
		return tankDurable;
	}
	public void setTankDurable(int tankDurable) {
		this.tankDurable = tankDurable;
	}
	public int getTankArmour() {
		return tankArmour;
	}
	public void setTankArmour(int tankArmour) {
		this.tankArmour = tankArmour;
	}
	public int getTankDodge() {
		return tankDodge;
	}
	public void setTankDodge(int tankDodge) {
		this.tankDodge = tankDodge;
	}
	public int getTankHide() {
		return tankHide;
	}
	public void setTankHide(int tankHide) {
		this.tankHide = tankHide;
	}
	public int getTankSpot() {
		return tankSpot;
	}
	public void setTankSpot(int tankSpot) {
		this.tankSpot = tankSpot;
	}
	public int getTankRange() {
		return tankRange;
	}
	public void setTankRange(int tankRange) {
		this.tankRange = tankRange;
	}
	public String getTankEquipmentSlots() {
		return tankEquipmentSlots;
	}
	public void setTankEquipmentSlots(String tankEquipmentSlots) {
		this.tankEquipmentSlots = tankEquipmentSlots;
	}
	public String getTankShield() {
		return tankShield;
	}
	public void setTankShield(String tankShield) {
		this.tankShield = tankShield;
	}
	public String getTankBullet() {
		return tankBullet;
	}
	public void setTankBullet(String tankBullet) {
		this.tankBullet = tankBullet;
	}
}
