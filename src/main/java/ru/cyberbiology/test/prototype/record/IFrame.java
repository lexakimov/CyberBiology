package ru.cyberbiology.test.prototype.record;

import ru.cyberbiology.test.prototype.IBot;

import java.io.DataOutputStream;
import java.io.IOException;

public interface IFrame {
	
	public void addBot(IBot bot, int x, int y);
	
	public int save(DataOutputStream fileout) throws IOException;
	
}
