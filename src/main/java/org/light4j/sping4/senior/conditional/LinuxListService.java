package org.light4j.sping4.senior.conditional;

public class LinuxListService implements ListService{

	@Override
	public String showListCmd() {
		return "ls";
	}
}
