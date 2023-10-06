import com.googlecode.lanterna.TextCharacter;
import com.googlecode.lanterna.input.KeyStroke;
import com.googlecode.lanterna.screen.Screen;

public class Arena {
    private Hero hero;
    private int width, height;

    public Arena(int width, int height) {
        this.width = width;
        this.height = height;
        hero = new Hero(width / 2, height / 2);
    }

    public void processKey(KeyStroke key) {
        System.out.println(key);
        String keyT = key.getKeyType().toString();
        switch (keyT) {
            case "ArrowUp":
                moveHero(hero.moveup());
                break;
            case "ArrowDown":
                moveHero(hero.movedown());
                break;
            case "ArrowLeft":
                moveHero(hero.moveleft());
                break;
            case "ArrowRight":
                moveHero(hero.moveright());
                break;
        }
    }
    public void draw(Screen screen) {
        hero.draw(screen);
    }
    private boolean canHeroMove(Position position) {
        if (position.getX() < 0) return false;
        if (position.getX() > width - 1 ) return false;
        if (position.getY() < 0) return false;
        if (position.getY() > height - 1 ) return false;
        return true;
    }
    public void moveHero(Position position) {
        if (canHeroMove(position))
            hero.setPosition(position);
    }
}