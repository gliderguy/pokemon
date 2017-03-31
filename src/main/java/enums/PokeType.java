package enums;

public enum PokeType {
        LAVA("Lava"),
        DREAM("Dream"),
        FIGHTING("Fighting");

        private final String type;

        PokeType(String type) {
            this.type = type;
        }

        public String getType() {
            return type;
        }
}
