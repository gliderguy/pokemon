package enums;

public enum PokeType {
        LAVA("Lava"),
        DREAM("Dream");

        private final String type;

        PokeType(String type) {
            this.type = type;
        }

        public String getType() {
            return type;
        }
}
