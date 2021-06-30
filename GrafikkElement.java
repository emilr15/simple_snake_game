import java.awt.Color;
import java.awt.Graphics;


public class GrafikkElement {

		private int x = 100;
		private int y = 100;
		private int bredde = 40;
		private int hoyde = 40;
		private Color farge = Color.GREEN;
		
		public void drawMe(Graphics g){
			g.setColor(farge);
			g.fillRect(this.x, this.y, bredde, hoyde);
			
		
		
		}

		public int getX() {
			return x;
		}

		public void setX(int x) {
			this.x = x;
		}

		public int getY() {
			return y;
		}

		public void setY(int y) {
			this.y = y;
		}

		public int getBredde() {
			return bredde;
		}

		public void setBredde(int bredde) {
			this.bredde = bredde;
		}

		public int getHoyde() {
			return hoyde;
		}

		public void setHoyde(int hoyde) {
			this.hoyde = hoyde;
		}

		public Color getFarge() {
			return farge;
		}

		public void setFarge(Color farge) {
			this.farge = farge;
		}
		

}