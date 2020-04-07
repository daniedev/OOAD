package ricksguitarapp.guitarspec;

public class GuitarSpec {
 
  private Builder builder;
  private String model;
  private Type type;
  private Wood backWood;
  private Wood topWood;
  private String numberOfStrings;

  public GuitarSpec(Builder builder, String model, Type type,
                    Wood backWood, Wood topWood, String numberOfStrings) {
    this.builder = builder;
    this.model = model;
    this.type = type;
    this.backWood = backWood;
    this.topWood = topWood;
    this.numberOfStrings = numberOfStrings;
  }

  public GuitarSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood) {
    this.builder = builder;
    this.model = model;
    this.type = type;
    this.backWood = backWood;
    this.topWood = topWood;
  }


  public Builder getBuilder() {
    return builder;
  }

  public String getModel() {
    return model;
  }

  public Type getType() {
    return type;
  }

  public Wood getBackWood() {
    return backWood;
  }

  public Wood getTopWood() {
    return topWood;
  }

  public String getNumberOfStrings() {
    return numberOfStrings;
  }

  @Override
  public boolean equals(Object obj) {
    GuitarSpec guitarSpec = (GuitarSpec)obj;
    return builder == guitarSpec.builder &&
            model.equals(guitarSpec.model) &&
            type == guitarSpec.type &&
            backWood == guitarSpec.backWood &&
            topWood == guitarSpec.topWood &&
            numberOfStrings.equals(guitarSpec.numberOfStrings);
  }

  @Override
  public String toString() {
    return "  We have a " +
            this.getBuilder() + " " + this.getModel() + " " +
            this.getType() + " guitar:\n     " +
            this.getBackWood() + " back and sides,\n     " +
            this.getTopWood() + " top.\n     with " +
            this.getNumberOfStrings() + " Strings.\n";
  }
}
