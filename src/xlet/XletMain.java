package xlet;

import javax.tv.xlet.Xlet;
import javax.tv.xlet.XletContext;
import javax.tv.xlet.XletStateChangeException;

import org.havi.ui.HScene;
import org.havi.ui.HSceneFactory;

public class XletMain implements Xlet {

	/**
	 * XletContext
	 */
	private XletContext context;

	/**
	 * XletContext ¹ÝÈ¯
	 *
	 * @return XletContext
	 */
	public XletContext getContext() {
		return context;
	}

	public void initXlet(XletContext context) throws XletStateChangeException {
		this.context = context;
		System.out.println("initXlet");
	}

	public void startXlet() throws XletStateChangeException {
		System.out.println("startXlet");
		HScene scene = HSceneFactory.getInstance().getDefaultHScene();
        scene.setBounds(0, 0, 960, 540);
        scene.setVisible(true);
	}

	public void destroyXlet(boolean unconditional) throws XletStateChangeException {
		System.out.println("destroyXlet");
	}

	public void pauseXlet() {
		System.out.println("pauseXlet");
	}

}