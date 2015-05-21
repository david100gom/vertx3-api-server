/**
 *
 */
package info.takebo.api.guice.matcher;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import com.google.inject.matcher.AbstractMatcher;

/**
 * public or protectedメソッドを対象とするMatcher
 *
 * @author takecy
 */
public class PublicOrProtectedMethodMatcher extends AbstractMatcher<Method> {

	@Override
	public boolean matches(Method method) {
		// 合成メソッド除外
		if (method.isSynthetic()) return false;

		return Modifier.isPublic(method.getModifiers()) || Modifier.isProtected(method.getModifiers());
	}

}
