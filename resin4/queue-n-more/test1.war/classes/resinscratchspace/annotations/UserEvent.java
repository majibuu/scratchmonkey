package resinscratchspace.annotations;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.inject.BindingType;

@BindingType
@Target({TYPE,FIELD,METHOD,PARAMETER})
@Retention(RUNTIME)
public @interface UserEvent {
}