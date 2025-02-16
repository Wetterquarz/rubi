package com.kevinsundqvistnorlen.rubi;

import net.minecraft.text.Style;

import java.util.Optional;

public interface IRubyStyle {
    static Optional<RubyText> getRuby(Style style) {
        return Optional.ofNullable(((IRubyStyle) style).rubi$getRuby());
    }

    Style rubi$withRuby(RubyText rubyText);

    RubyText rubi$getRuby();
}
