package com.tenpisoft.n2w.internal.languages.spanish;

import com.tenpisoft.n2w.internal.languages.GenderType;
import com.tenpisoft.n2w.internal.languages.PluralForms;

public class SpanishPluralForms implements PluralForms {
    private final String form;

    public SpanishPluralForms(String form) {
        this.form = form;
    }

    @Override
    public String formFor(Integer value) {
        return form;
    }

    @Override
    public GenderType genderType() {
        return GenderType.NON_APPLICABLE;
    }
}
