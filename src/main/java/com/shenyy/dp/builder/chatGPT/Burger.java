package com.shenyy.dp.builder.chatGPT;

public class Burger {
    private String bread;
    private String meat;
    private String sauce;
    private String cheese;
    private String vegetables[];

    public Burger(Builder builder) {
        this.bread = builder.bread;
        this.meat = builder.meat;
        this.sauce = builder.sauce;
        this.cheese = builder.cheese;
        this.vegetables = builder.vegetables;
    }

    public static class Builder {
        private String bread;
        private String meat;
        private String sauce;
        private String cheese;
        private String vegetables[];

        public Builder bread(String bread) {
            this.bread = bread;
            return this;
        }

        public Builder meat(String meat) {
            this.meat = meat;
            return this;
        }

        public Builder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public Builder cheese(String cheese) {
            this.cheese = cheese;
            return this;
        }

        public Builder vegetables(String[] vegetables) {
            this.vegetables = vegetables;
            return this;
        }

        public Burger build() {
            return new Burger(this);
        }
    }

}
