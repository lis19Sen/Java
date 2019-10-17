package pcomputer;

import java.util.Random;

public class Computer {

	
	protected String manufacture;
	protected String processer;
	protected int ramSize;
	protected int diskSize;
	public static int count;
	public Computer(String manufacture,String processer,int ramSize,int diskSize)
	{
		super();
		this.manufacture = manufacture;
		this.manufacture = processer;
		this.ramSize = ramSize;
		this.diskSize = diskSize;
		count++;
	}
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		Computer.count = count;
	}
	public String getManufacture() {
		return manufacture;
	}
	public void setManufacture(String manufacture) {
		this.manufacture = manufacture;
	}
	public String getProcesser() {
		return processer;
	}
	public void setProcesser(String processer) {
		this.processer = processer;
	}
	public int getRamSize() {
		return ramSize;
	}
	public void setRamSize(int ramSize) {
		this.ramSize = ramSize;
	}
	public int getDiskSize() {
		return diskSize;
	}
	public void setDiskSize(int diskSize) {
		this.diskSize = diskSize;
	}
	public String toString()
	{
		return ("Manufacture: " + manufacture +
				"Processer:   " + processer   +
				"Ram Size :   " + ramSize   +
				"Disk Size:   " + diskSize  +
				"Count" +Integer.toString(count));
	}
}
