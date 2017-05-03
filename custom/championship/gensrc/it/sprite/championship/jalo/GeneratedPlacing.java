/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 4-mag-2017 0.27.29                          ---
 * ----------------------------------------------------------------
 */
package it.sprite.championship.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import it.sprite.championship.constants.ChampionshipConstants;
import it.sprite.championship.jalo.Driver;
import it.sprite.championship.jalo.GranPrix;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Placing}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedPlacing extends GenericItem
{
	/** Qualifier of the <code>Placing.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>Placing.time</code> attribute **/
	public static final String TIME = "time";
	/** Qualifier of the <code>Placing.position</code> attribute **/
	public static final String POSITION = "position";
	/** Qualifier of the <code>Placing.granPrix</code> attribute **/
	public static final String GRANPRIX = "granPrix";
	/** Qualifier of the <code>Placing.driver</code> attribute **/
	public static final String DRIVER = "driver";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n GRANPRIX's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedPlacing> GRANPRIXHANDLER = new BidirectionalOneToManyHandler<GeneratedPlacing>(
	ChampionshipConstants.TC.PLACING,
	false,
	"granPrix",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n DRIVER's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedPlacing> DRIVERHANDLER = new BidirectionalOneToManyHandler<GeneratedPlacing>(
	ChampionshipConstants.TC.PLACING,
	false,
	"driver",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CODE, AttributeMode.INITIAL);
		tmp.put(TIME, AttributeMode.INITIAL);
		tmp.put(POSITION, AttributeMode.INITIAL);
		tmp.put(GRANPRIX, AttributeMode.INITIAL);
		tmp.put(DRIVER, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Placing.code</code> attribute.
	 * @return the code
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Placing.code</code> attribute.
	 * @return the code
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Placing.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Placing.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		GRANPRIXHANDLER.newInstance(ctx, allAttributes);
		DRIVERHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Placing.driver</code> attribute.
	 * @return the driver
	 */
	public Driver getDriver(final SessionContext ctx)
	{
		return (Driver)getProperty( ctx, DRIVER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Placing.driver</code> attribute.
	 * @return the driver
	 */
	public Driver getDriver()
	{
		return getDriver( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Placing.driver</code> attribute. 
	 * @param value the driver
	 */
	public void setDriver(final SessionContext ctx, final Driver value)
	{
		DRIVERHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Placing.driver</code> attribute. 
	 * @param value the driver
	 */
	public void setDriver(final Driver value)
	{
		setDriver( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Placing.granPrix</code> attribute.
	 * @return the granPrix
	 */
	public GranPrix getGranPrix(final SessionContext ctx)
	{
		return (GranPrix)getProperty( ctx, GRANPRIX);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Placing.granPrix</code> attribute.
	 * @return the granPrix
	 */
	public GranPrix getGranPrix()
	{
		return getGranPrix( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Placing.granPrix</code> attribute. 
	 * @param value the granPrix
	 */
	public void setGranPrix(final SessionContext ctx, final GranPrix value)
	{
		GRANPRIXHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Placing.granPrix</code> attribute. 
	 * @param value the granPrix
	 */
	public void setGranPrix(final GranPrix value)
	{
		setGranPrix( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Placing.position</code> attribute.
	 * @return the position - Driver's position
	 */
	public Integer getPosition(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, POSITION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Placing.position</code> attribute.
	 * @return the position - Driver's position
	 */
	public Integer getPosition()
	{
		return getPosition( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Placing.position</code> attribute. 
	 * @return the position - Driver's position
	 */
	public int getPositionAsPrimitive(final SessionContext ctx)
	{
		Integer value = getPosition( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Placing.position</code> attribute. 
	 * @return the position - Driver's position
	 */
	public int getPositionAsPrimitive()
	{
		return getPositionAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Placing.position</code> attribute. 
	 * @param value the position - Driver's position
	 */
	public void setPosition(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, POSITION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Placing.position</code> attribute. 
	 * @param value the position - Driver's position
	 */
	public void setPosition(final Integer value)
	{
		setPosition( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Placing.position</code> attribute. 
	 * @param value the position - Driver's position
	 */
	public void setPosition(final SessionContext ctx, final int value)
	{
		setPosition( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Placing.position</code> attribute. 
	 * @param value the position - Driver's position
	 */
	public void setPosition(final int value)
	{
		setPosition( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Placing.time</code> attribute.
	 * @return the time - Driver's time
	 */
	public Integer getTime(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, TIME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Placing.time</code> attribute.
	 * @return the time - Driver's time
	 */
	public Integer getTime()
	{
		return getTime( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Placing.time</code> attribute. 
	 * @return the time - Driver's time
	 */
	public int getTimeAsPrimitive(final SessionContext ctx)
	{
		Integer value = getTime( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Placing.time</code> attribute. 
	 * @return the time - Driver's time
	 */
	public int getTimeAsPrimitive()
	{
		return getTimeAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Placing.time</code> attribute. 
	 * @param value the time - Driver's time
	 */
	public void setTime(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, TIME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Placing.time</code> attribute. 
	 * @param value the time - Driver's time
	 */
	public void setTime(final Integer value)
	{
		setTime( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Placing.time</code> attribute. 
	 * @param value the time - Driver's time
	 */
	public void setTime(final SessionContext ctx, final int value)
	{
		setTime( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Placing.time</code> attribute. 
	 * @param value the time - Driver's time
	 */
	public void setTime(final int value)
	{
		setTime( getSession().getSessionContext(), value );
	}
	
}
