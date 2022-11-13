package uet.oop.bomberman.entities.tile.item;

import uet.oop.bomberman.Game;
import uet.oop.bomberman.entities.Entity;
import uet.oop.bomberman.entities.character.Bomber;
import uet.oop.bomberman.graphics.Sprite;


public class FlameItem extends Item {

	public FlameItem(int x, int y, Sprite sprite) {
		super(x, y, sprite);
	}

	@Override
	public boolean collide(Entity e) {
		// xử lý Bomber ăn Item
                //  xử lý Bomber ăn Item  cộng flame
                if(e instanceof Bomber) { // kiểm tra entity có phải là bomberman ko
                        // add thêm  sức mạnh của flame
                        ((Bomber) e).addPowerup(this); 
			remove();
			return true;
		}
		return false;
	}

    @Override
    public void setValues() {
		this.setActive(true);
		// tăng bán kính bom
		Game.addBombRadius(2);
    }
}
