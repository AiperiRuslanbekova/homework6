package com.company;

public class Hero {

        private int heroHealth;
        private int heroDamage;
        private String heroSuperAbility;

    public Hero(int heroHealth, int heroDamage, String heroSuperAbility) {
            this.heroHealth = heroHealth;
            this.heroDamage = heroDamage;
            this.heroSuperAbility = heroSuperAbility;
        }

    public Hero(int heroHealth, int heroDamage) {
            this.heroHealth = heroHealth;
            this.heroDamage = heroDamage;
        }

        public int getHeroHealth() {
            return heroHealth;
        }

        public int getHeroDamage() {
            return heroDamage;
        }

        public String getHeroSuperAbility() {
            return heroSuperAbility;
        }


    }



