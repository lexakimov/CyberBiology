package ru.cyberbiology.test.prototype.view;

import ru.cyberbiology.test.World;

import javax.swing.*;
import java.awt.*;

public interface IView {
	public Image paint(World world, JPanel canvas);
	
	public String getName();
}
