import processing.core.PApplet;

public class Projectile extends MainObject {
	public Projectile(PApplet d, Player player) {
		super(d);
		this.x = player.x + 25;
		this.y = player.y;

	}

	public void draw() {

		drawing.fill(0, 255, 0);
		drawing.ellipse(this.x, this.y, 10, 10);

	}

	public void shoot() {
		this.y -= 200 * Clock.elapsedTime;

	}

}