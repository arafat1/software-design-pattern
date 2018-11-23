package design.patterns.builderpattern;

public class GameLaptop extends AbstractLaptop {
    private final int gpuMem;
    private final int fans;

    public static class Builder extends AbstractLaptop.Builder<Builder> {
        private int gpuMem;
        private int fans;

        public Builder(int gpuMem, int fans) {
            this.gpuMem = gpuMem;
            this.fans = fans;
        }

        @Override
        GameLaptop build() {
            return new GameLaptop(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    private GameLaptop(Builder builder) {
        super(builder);
        this.gpuMem = builder.gpuMem;
        this.fans = builder.fans;
    }

    public int getGpuMem() {
        return gpuMem;
    }

    public int getFans() {
        return fans;
    }
}
