package com.imerir;

public enum Weather {
    STORMY{
        @Override
        public String toString() {
            return "STORMY";
        }
    },
    CLOUDY{
        @Override
        public String toString() {
            return "CLOUDY";
        }
    },
    SUNNY{
        @Override
        public String toString() {
            return "SUNNY";
        }
    },
    VERY_HOT{
        @Override
        public String toString() {
            return "VERY HOT";
        }
    }
}
