
public abstract class Element {

	protected final Type type;

	public Element(Type t) {
		this.type = t;
	}

	public Type getType() {
		return type;
	}

	public abstract boolean bougerVers(Direction direction);

}
