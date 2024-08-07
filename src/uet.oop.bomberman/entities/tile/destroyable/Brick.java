package uet.oop.bomberman.entities.tile.destroyable;


import java.util.ArrayList;
import uet.oop.bomberman.Game;
import uet.oop.bomberman.entities.Entity;
import uet.oop.bomberman.entities.bomb.Bomb;
import uet.oop.bomberman.entities.bomb.Flame;
import uet.oop.bomberman.entities.character.Bomber;
import uet.oop.bomberman.graphics.Screen;
import uet.oop.bomberman.graphics.Sprite;
import uet.oop.bomberman.level.Coordinates;


public class Brick extends DestroyableTile {
    public static  ArrayList<Integer> Xgachvo = new ArrayList();
    public static    ArrayList<Integer> Ygachvo = new ArrayList();
    public Brick(int x, int y, Sprite sprite) {
		super(x, y, sprite);
	}
    public static void addXgachvo(int x) {
            Xgachvo.add(x);
          }
    public static void addYgachvo(int y) {
           Ygachvo.add(y);
    }
	@Override
    public void update() {
		super.update();
	}
	
	@Override
	public void render(Screen screen) {
		int x = Coordinates.tileToPixel(_x);
		int y = Coordinates.tileToPixel(_y);
		
		if(_destroyed) {
			_sprite = movingSprite(Sprite.brick_exploded, Sprite.brick_exploded1, Sprite.brick_exploded2);
			
			screen.renderEntityWithBelowSprite(x, y, this, _belowSprite);
		}
		else
			screen.renderEntity( x, y, this);
	}
   
        @Override
	public boolean collide(Entity e) {
            // khi ma hack 
            if( e instanceof Bomb){
                if( ((Bomb)e).isExploded() == true){
                    destroy();
                }
            }
		if(e instanceof Flame){
                 
			addXgachvo(this.getXtile());
                        addYgachvo(this.getYtile());

                        destroy();
                        return false; // cho qua khi no xong
                }
		// khoong cho qua
		return false;
	}
        public int getXtile(){
                return (int) this._x;
        }
        public int getYtile(){
            return (int) this._y;
        }
        
}
