import com.googlecode.lanterna.TextCharacter;
import com.googlecode.lanterna.screen.Screen;

public class Hero {
    private int x;
    private int y;

    public Hero(int i, int i1) {
        this.x = i;
        this.y = i1;
    }

    public void draw(Screen screen) {
        screen.setCharacter(this.x, this.y, TextCharacter.fromCharacter('X')[0]);
    }
    public void moveup (){
        this.y = this.y - 1;
    }
    public void movedown() {
        this.y = this.y + 1;
    }
    public void moveleft() {
        this.x = this.x - 1;
    }
    public void moveright() {
        this.x = this.x + 1;
    }
}


