package ru.cyberbiology.test;

import ru.cyberbiology.test.prototype.IWindow;
import ru.cyberbiology.test.prototype.view.IView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewMenuActionListener implements ActionListener {
	IWindow window;
	IView view;
	
	public ViewMenuActionListener(IWindow window, IView rend) {
		this.window = window;
		this.view = rend;
	}
	
	public void actionPerformed(ActionEvent e) {
		this.window.setView(this.view);
	}
}
