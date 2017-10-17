package com.deg540.fizzbuzz;

class Rule {
    private Predicate predicate;
    private String replacement;

    public Rule(Predicate predicate, String replacement) {
        this.predicate = predicate;
        this.replacement = replacement;
    }

    public boolean isSatisfiedBy(int number) {
        return predicate.apply(number);
    }

    public String replacement() {
        return replacement;
    }
}
