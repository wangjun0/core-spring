/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3</a>, using an XML
 * Schema.
 * $Id$
 */

package com.baobaotao.domain.castor;

/**
 * Class Logs.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class Logs implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _loginLogList.
     */
    private java.util.List<LoginLog> _loginLogList;


      //----------------/
     //- Constructors -/
    //----------------/

    public Logs() {
        super();
        this._loginLogList = new java.util.ArrayList<LoginLog>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vLoginLog
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addLoginLog(
            final LoginLog vLoginLog)
    throws IndexOutOfBoundsException {
        this._loginLogList.add(vLoginLog);
    }

    /**
     * 
     * 
     * @param index
     * @param vLoginLog
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addLoginLog(
            final int index,
            final LoginLog vLoginLog)
    throws IndexOutOfBoundsException {
        this._loginLogList.add(index, vLoginLog);
    }

    /**
     * Method enumerateLoginLog.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends LoginLog> enumerateLoginLog(
    ) {
        return java.util.Collections.enumeration(this._loginLogList);
    }

    /**
     * Method getLoginLog.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * com.baobaotao.domain.castor.LoginLog at the given index
     */
    public LoginLog getLoginLog(
            final int index)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._loginLogList.size()) {
            throw new IndexOutOfBoundsException("getLoginLog: Index value '" + index + "' not in range [0.." + (this._loginLogList.size() - 1) + "]");
        }

        return (LoginLog) _loginLogList.get(index);
    }

    /**
     * Method getLoginLog.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public LoginLog[] getLoginLog(
    ) {
        LoginLog[] array = new LoginLog[0];
        return (LoginLog[]) this._loginLogList.toArray(array);
    }

    /**
     * Method getLoginLogCount.
     * 
     * @return the size of this collection
     */
    public int getLoginLogCount(
    ) {
        return this._loginLogList.size();
    }

    /**
     * Method isValid.
     * 
     * @return true if this object is valid according to the schema
     */
    public boolean isValid(
    ) {
        try {
            validate();
        } catch (org.exolab.castor.xml.ValidationException vex) {
            return false;
        }
        return true;
    }

    /**
     * Method iterateLoginLog.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends LoginLog> iterateLoginLog(
    ) {
        return this._loginLogList.iterator();
    }

    /**
     * 
     * 
     * @param out
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */
    public void marshal(
            final java.io.Writer out)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        org.exolab.castor.xml.Marshaller.marshal(this, out);
    }

    /**
     * 
     * 
     * @param handler
     * @throws java.io.IOException if an IOException occurs during
     * marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     */
    public void marshal(
            final org.xml.sax.ContentHandler handler)
    throws java.io.IOException, org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        org.exolab.castor.xml.Marshaller.marshal(this, handler);
    }

    /**
     */
    public void removeAllLoginLog(
    ) {
        this._loginLogList.clear();
    }

    /**
     * Method removeLoginLog.
     * 
     * @param vLoginLog
     * @return true if the object was removed from the collection.
     */
    public boolean removeLoginLog(
            final LoginLog vLoginLog) {
        boolean removed = _loginLogList.remove(vLoginLog);
        return removed;
    }

    /**
     * Method removeLoginLogAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public LoginLog removeLoginLogAt(
            final int index) {
        Object obj = this._loginLogList.remove(index);
        return (LoginLog) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vLoginLog
     * @throws IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setLoginLog(
            final int index,
            final LoginLog vLoginLog)
    throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._loginLogList.size()) {
            throw new IndexOutOfBoundsException("setLoginLog: Index value '" + index + "' not in range [0.." + (this._loginLogList.size() - 1) + "]");
        }

        this._loginLogList.set(index, vLoginLog);
    }

    /**
     * 
     * 
     * @param vLoginLogArray
     */
    public void setLoginLog(
            final LoginLog[] vLoginLogArray) {
        //-- copy array
        _loginLogList.clear();

        for (int i = 0; i < vLoginLogArray.length; i++) {
                this._loginLogList.add(vLoginLogArray[i]);
        }
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled com.baobaotao.domain.castor.Logs
     */
    public static Logs unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (Logs) org.exolab.castor.xml.Unmarshaller.unmarshal(Logs.class, reader);
    }

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */
    public void validate(
    )
    throws org.exolab.castor.xml.ValidationException {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    }

}
