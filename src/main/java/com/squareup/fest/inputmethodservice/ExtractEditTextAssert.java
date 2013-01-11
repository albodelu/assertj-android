// Copyright 2013 Square, Inc.
package com.squareup.fest.inputmethodservice;

import android.inputmethodservice.ExtractEditText;
import com.squareup.fest.widget.AbstractTextViewAssert;

import static org.fest.assertions.api.Assertions.assertThat;

public class ExtractEditTextAssert extends AbstractTextViewAssert<ExtractEditTextAssert, ExtractEditText> {
  public ExtractEditTextAssert(ExtractEditText actual) {
    super(actual, ExtractEditTextAssert.class);
  }

  public ExtractEditTextAssert isInputMethodTarget() {
    isNotNull();
    assertThat(actual.isInputMethodTarget()) //
        .overridingErrorMessage("Expected to be input method target but was not.") //
        .isTrue();
    return this;
  }

  public ExtractEditTextAssert isNotInputMethodTarget() {
    isNotNull();
    assertThat(actual.isInputMethodTarget()) //
        .overridingErrorMessage("Expected to not be input method target but was.") //
        .isFalse();
    return this;
  }
}
