// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package iso4217_currency_codes.proxies;

public class ISO4217_CurrencyCode
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject iSO4217_CurrencyCodeMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "ISO4217_Currency_Codes.ISO4217_CurrencyCode";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		AlphabeticCode("AlphabeticCode"),
		Currency("Currency"),
		Entity("Entity"),
		MinorUnit("MinorUnit"),
		NumericCode("NumericCode"),
		WithdrawalDate("WithdrawalDate");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public ISO4217_CurrencyCode(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "ISO4217_Currency_Codes.ISO4217_CurrencyCode"));
	}

	protected ISO4217_CurrencyCode(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject iSO4217_CurrencyCodeMendixObject)
	{
		if (iSO4217_CurrencyCodeMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("ISO4217_Currency_Codes.ISO4217_CurrencyCode", iSO4217_CurrencyCodeMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a ISO4217_Currency_Codes.ISO4217_CurrencyCode");

		this.iSO4217_CurrencyCodeMendixObject = iSO4217_CurrencyCodeMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'ISO4217_CurrencyCode.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static iso4217_currency_codes.proxies.ISO4217_CurrencyCode initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return iso4217_currency_codes.proxies.ISO4217_CurrencyCode.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static iso4217_currency_codes.proxies.ISO4217_CurrencyCode initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new iso4217_currency_codes.proxies.ISO4217_CurrencyCode(context, mendixObject);
	}

	public static iso4217_currency_codes.proxies.ISO4217_CurrencyCode load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return iso4217_currency_codes.proxies.ISO4217_CurrencyCode.initialize(context, mendixObject);
	}

	public static java.util.List<iso4217_currency_codes.proxies.ISO4217_CurrencyCode> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<iso4217_currency_codes.proxies.ISO4217_CurrencyCode> result = new java.util.ArrayList<iso4217_currency_codes.proxies.ISO4217_CurrencyCode>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//ISO4217_Currency_Codes.ISO4217_CurrencyCode" + xpathConstraint))
			result.add(iso4217_currency_codes.proxies.ISO4217_CurrencyCode.initialize(context, obj));
		return result;
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of AlphabeticCode
	 */
	public final java.lang.String getAlphabeticCode()
	{
		return getAlphabeticCode(getContext());
	}

	/**
	 * @param context
	 * @return value of AlphabeticCode
	 */
	public final java.lang.String getAlphabeticCode(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.AlphabeticCode.toString());
	}

	/**
	 * Set value of AlphabeticCode
	 * @param alphabeticcode
	 */
	public final void setAlphabeticCode(java.lang.String alphabeticcode)
	{
		setAlphabeticCode(getContext(), alphabeticcode);
	}

	/**
	 * Set value of AlphabeticCode
	 * @param context
	 * @param alphabeticcode
	 */
	public final void setAlphabeticCode(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String alphabeticcode)
	{
		getMendixObject().setValue(context, MemberNames.AlphabeticCode.toString(), alphabeticcode);
	}

	/**
	 * @return value of Currency
	 */
	public final java.lang.String getCurrency()
	{
		return getCurrency(getContext());
	}

	/**
	 * @param context
	 * @return value of Currency
	 */
	public final java.lang.String getCurrency(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Currency.toString());
	}

	/**
	 * Set value of Currency
	 * @param currency
	 */
	public final void setCurrency(java.lang.String currency)
	{
		setCurrency(getContext(), currency);
	}

	/**
	 * Set value of Currency
	 * @param context
	 * @param currency
	 */
	public final void setCurrency(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String currency)
	{
		getMendixObject().setValue(context, MemberNames.Currency.toString(), currency);
	}

	/**
	 * @return value of Entity
	 */
	public final java.lang.String getEntity()
	{
		return getEntity(getContext());
	}

	/**
	 * @param context
	 * @return value of Entity
	 */
	public final java.lang.String getEntity(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Entity.toString());
	}

	/**
	 * Set value of Entity
	 * @param entity
	 */
	public final void setEntity(java.lang.String entity)
	{
		setEntity(getContext(), entity);
	}

	/**
	 * Set value of Entity
	 * @param context
	 * @param entity
	 */
	public final void setEntity(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String entity)
	{
		getMendixObject().setValue(context, MemberNames.Entity.toString(), entity);
	}

	/**
	 * @return value of MinorUnit
	 */
	public final java.lang.String getMinorUnit()
	{
		return getMinorUnit(getContext());
	}

	/**
	 * @param context
	 * @return value of MinorUnit
	 */
	public final java.lang.String getMinorUnit(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.MinorUnit.toString());
	}

	/**
	 * Set value of MinorUnit
	 * @param minorunit
	 */
	public final void setMinorUnit(java.lang.String minorunit)
	{
		setMinorUnit(getContext(), minorunit);
	}

	/**
	 * Set value of MinorUnit
	 * @param context
	 * @param minorunit
	 */
	public final void setMinorUnit(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String minorunit)
	{
		getMendixObject().setValue(context, MemberNames.MinorUnit.toString(), minorunit);
	}

	/**
	 * @return value of NumericCode
	 */
	public final java.lang.Integer getNumericCode()
	{
		return getNumericCode(getContext());
	}

	/**
	 * @param context
	 * @return value of NumericCode
	 */
	public final java.lang.Integer getNumericCode(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.NumericCode.toString());
	}

	/**
	 * Set value of NumericCode
	 * @param numericcode
	 */
	public final void setNumericCode(java.lang.Integer numericcode)
	{
		setNumericCode(getContext(), numericcode);
	}

	/**
	 * Set value of NumericCode
	 * @param context
	 * @param numericcode
	 */
	public final void setNumericCode(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer numericcode)
	{
		getMendixObject().setValue(context, MemberNames.NumericCode.toString(), numericcode);
	}

	/**
	 * @return value of WithdrawalDate
	 */
	public final java.lang.String getWithdrawalDate()
	{
		return getWithdrawalDate(getContext());
	}

	/**
	 * @param context
	 * @return value of WithdrawalDate
	 */
	public final java.lang.String getWithdrawalDate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.WithdrawalDate.toString());
	}

	/**
	 * Set value of WithdrawalDate
	 * @param withdrawaldate
	 */
	public final void setWithdrawalDate(java.lang.String withdrawaldate)
	{
		setWithdrawalDate(getContext(), withdrawaldate);
	}

	/**
	 * Set value of WithdrawalDate
	 * @param context
	 * @param withdrawaldate
	 */
	public final void setWithdrawalDate(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String withdrawaldate)
	{
		getMendixObject().setValue(context, MemberNames.WithdrawalDate.toString(), withdrawaldate);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return iSO4217_CurrencyCodeMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final iso4217_currency_codes.proxies.ISO4217_CurrencyCode that = (iso4217_currency_codes.proxies.ISO4217_CurrencyCode) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "ISO4217_Currency_Codes.ISO4217_CurrencyCode";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
