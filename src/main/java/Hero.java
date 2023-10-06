import com.googlecode.lanterna.TextCharacter;
import com.googlecode.lanterna.screen.Screen;

public class Hero {
    private Position position;

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Hero(int i, int i1) {
        this.position = new Position(i, i1);
    }

    public void draw(Screen screen) {
        screen.setCharacter(position.getX(), position.getY(), TextCharacter.fromCharacter('X')[0]);
    }
    public Position moveup (){
        return new Position(position.getX(), position.getY() - 1 );
    }
    public Position movedown() {
        return new Position(position.getX(), position.getY() + 1 );
    }
    public Position moveleft() {
        return new Position(position.getX() - 1, position.getY());
    }
    public Position moveright() {
        return new Position(position.getX() + 1, position.getY());
    }
}


