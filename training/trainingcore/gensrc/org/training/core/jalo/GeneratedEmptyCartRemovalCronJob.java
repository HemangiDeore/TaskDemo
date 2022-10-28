/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 12, 2022, 11:06:10 PM                   ---
 * ----------------------------------------------------------------
 */
package org.training.core.jalo;

import de.hybris.platform.cronjob.jalo.CronJob;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.training.core.constants.TrainingCoreConstants;

/**
 * Generated class for type {@link org.training.core.jalo.EmptyCartRemovalCronJob EmptyCartRemovalCronJob}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedEmptyCartRemovalCronJob extends CronJob
{
	/** Qualifier of the <code>EmptyCartRemovalCronJob.xDaysOld</code> attribute **/
	public static final String XDAYSOLD = "xDaysOld";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(CronJob.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(XDAYSOLD, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EmptyCartRemovalCronJob.xDaysOld</code> attribute.
	 * @return the xDaysOld - Remove empty cart
	 */
	public Integer getXDaysOld(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, XDAYSOLD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EmptyCartRemovalCronJob.xDaysOld</code> attribute.
	 * @return the xDaysOld - Remove empty cart
	 */
	public Integer getXDaysOld()
	{
		return getXDaysOld( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EmptyCartRemovalCronJob.xDaysOld</code> attribute. 
	 * @return the xDaysOld - Remove empty cart
	 */
	public int getXDaysOldAsPrimitive(final SessionContext ctx)
	{
		Integer value = getXDaysOld( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EmptyCartRemovalCronJob.xDaysOld</code> attribute. 
	 * @return the xDaysOld - Remove empty cart
	 */
	public int getXDaysOldAsPrimitive()
	{
		return getXDaysOldAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EmptyCartRemovalCronJob.xDaysOld</code> attribute. 
	 * @param value the xDaysOld - Remove empty cart
	 */
	public void setXDaysOld(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, XDAYSOLD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EmptyCartRemovalCronJob.xDaysOld</code> attribute. 
	 * @param value the xDaysOld - Remove empty cart
	 */
	public void setXDaysOld(final Integer value)
	{
		setXDaysOld( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EmptyCartRemovalCronJob.xDaysOld</code> attribute. 
	 * @param value the xDaysOld - Remove empty cart
	 */
	public void setXDaysOld(final SessionContext ctx, final int value)
	{
		setXDaysOld( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EmptyCartRemovalCronJob.xDaysOld</code> attribute. 
	 * @param value the xDaysOld - Remove empty cart
	 */
	public void setXDaysOld(final int value)
	{
		setXDaysOld( getSession().getSessionContext(), value );
	}
	
}
