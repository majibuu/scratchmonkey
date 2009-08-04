/*
 * $Id: $
 * $URL:$
 */

package test;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.enterprise.inject.BindingType;

/**
 * A local binding type.
 */

@BindingType
@Target({FIELD,METHOD,PARAMETER})
@Retention(RUNTIME)
public @interface Ours
{}