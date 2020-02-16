
package org.clintrorick.bggxmlapiwrapper;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="postdate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="postdate_timestamp" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="editdate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="editdate_timestamp" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="thumbs" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="numitems" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="item" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="body" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="objecttype" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="subtype" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="objectid" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="objectname" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="username" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="postdate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="editdate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="thumbs" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *                 &lt;attribute name="imageid" type="{http://www.w3.org/2001/XMLSchema}int" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="termsofuse" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "postdate",
    "postdateTimestamp",
    "editdate",
    "editdateTimestamp",
    "thumbs",
    "numitems",
    "username",
    "title",
    "description",
    "item"
})
@XmlRootElement(name = "geeklist")
public class Geeklist {

    @XmlElement(required = true)
    protected String postdate;
    @XmlElement(name = "postdate_timestamp")
    protected int postdateTimestamp;
    @XmlElement(required = true)
    protected String editdate;
    @XmlElement(name = "editdate_timestamp")
    protected int editdateTimestamp;
    protected int thumbs;
    protected short numitems;
    @XmlElement(required = true)
    protected String username;
    @XmlElement(required = true)
    protected String title;
    @XmlElement(required = true)
    protected String description;
    protected List<Geeklist.Item> item;
    @XmlAttribute(name = "id")
    protected Integer id;
    @XmlAttribute(name = "termsofuse")
    protected String termsofuse;

    /**
     * Gets the value of the postdate property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPostdate() {
        return postdate;
    }

    /**
     * Sets the value of the postdate property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPostdate(String value) {
        this.postdate = value;
    }

    /**
     * Gets the value of the postdateTimestamp property.
     *
     */
    public int getPostdateTimestamp() {
        return postdateTimestamp;
    }

    /**
     * Sets the value of the postdateTimestamp property.
     *
     */
    public void setPostdateTimestamp(int value) {
        this.postdateTimestamp = value;
    }

    /**
     * Gets the value of the editdate property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEditdate() {
        return editdate;
    }

    /**
     * Sets the value of the editdate property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEditdate(String value) {
        this.editdate = value;
    }

    /**
     * Gets the value of the editdateTimestamp property.
     *
     */
    public int getEditdateTimestamp() {
        return editdateTimestamp;
    }

    /**
     * Sets the value of the editdateTimestamp property.
     *
     */
    public void setEditdateTimestamp(int value) {
        this.editdateTimestamp = value;
    }

    /**
     * Gets the value of the thumbs property.
     *
     */
    public int getThumbs() {
        return thumbs;
    }

    /**
     * Sets the value of the thumbs property.
     *
     */
    public void setThumbs(int value) {
        this.thumbs = value;
    }

    /**
     * Gets the value of the numitems property.
     *
     */
    public short getNumitems() {
        return numitems;
    }

    /**
     * Sets the value of the numitems property.
     *
     */
    public void setNumitems(short value) {
        this.numitems = value;
    }

    /**
     * Gets the value of the username property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Gets the value of the title property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the description property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the item property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the item property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItem().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Geeklist.Item }
     *
     *
     */
    public List<Geeklist.Item> getItem() {
        if (item == null) {
            item = new ArrayList<Geeklist.Item>();
        }
        return this.item;
    }

    /**
     * Gets the value of the id property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Gets the value of the termsofuse property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTermsofuse() {
        return termsofuse;
    }

    /**
     * Sets the value of the termsofuse property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTermsofuse(String value) {
        this.termsofuse = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="body" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="objecttype" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="subtype" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="objectid" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="objectname" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="username" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="postdate" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="editdate" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="thumbs" type="{http://www.w3.org/2001/XMLSchema}byte" />
     *       &lt;attribute name="imageid" type="{http://www.w3.org/2001/XMLSchema}int" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "body"
    })
    public static class Item {

        @XmlElement(required = true)
        protected String body;
        @XmlAttribute(name = "id")
        protected Integer id;
        @XmlAttribute(name = "objecttype")
        protected String objecttype;
        @XmlAttribute(name = "subtype")
        protected String subtype;
        @XmlAttribute(name = "objectid")
        protected Integer objectid;
        @XmlAttribute(name = "objectname")
        protected String objectname;
        @XmlAttribute(name = "username")
        protected String username;
        @XmlAttribute(name = "postdate")
        protected String postdate;
        @XmlAttribute(name = "editdate")
        protected String editdate;
        @XmlAttribute(name = "thumbs")
        protected Byte thumbs;
        @XmlAttribute(name = "imageid")
        protected Integer imageid;

        /**
         * Gets the value of the body property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getBody() {
            return body;
        }

        /**
         * Sets the value of the body property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setBody(String value) {
            this.body = value;
        }

        /**
         * Gets the value of the id property.
         *
         * @return
         *     possible object is
         *     {@link Integer }
         *
         */
        public Integer getId() {
            return id;
        }

        /**
         * Sets the value of the id property.
         *
         * @param value
         *     allowed object is
         *     {@link Integer }
         *
         */
        public void setId(Integer value) {
            this.id = value;
        }

        /**
         * Gets the value of the objecttype property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getObjecttype() {
            return objecttype;
        }

        /**
         * Sets the value of the objecttype property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setObjecttype(String value) {
            this.objecttype = value;
        }

        /**
         * Gets the value of the subtype property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getSubtype() {
            return subtype;
        }

        /**
         * Sets the value of the subtype property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setSubtype(String value) {
            this.subtype = value;
        }

        /**
         * Gets the value of the objectid property.
         *
         * @return
         *     possible object is
         *     {@link Integer }
         *
         */
        public Integer getObjectid() {
            return objectid;
        }

        /**
         * Sets the value of the objectid property.
         *
         * @param value
         *     allowed object is
         *     {@link Integer }
         *
         */
        public void setObjectid(Integer value) {
            this.objectid = value;
        }

        /**
         * Gets the value of the objectname property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getObjectname() {
            return objectname;
        }

        /**
         * Sets the value of the objectname property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setObjectname(String value) {
            this.objectname = value;
        }

        /**
         * Gets the value of the username property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getUsername() {
            return username;
        }

        /**
         * Sets the value of the username property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setUsername(String value) {
            this.username = value;
        }

        /**
         * Gets the value of the postdate property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getPostdate() {
            return postdate;
        }

        /**
         * Sets the value of the postdate property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setPostdate(String value) {
            this.postdate = value;
        }

        /**
         * Gets the value of the editdate property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getEditdate() {
            return editdate;
        }

        /**
         * Sets the value of the editdate property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setEditdate(String value) {
            this.editdate = value;
        }

        /**
         * Gets the value of the thumbs property.
         *
         * @return
         *     possible object is
         *     {@link Byte }
         *
         */
        public Byte getThumbs() {
            return thumbs;
        }

        /**
         * Sets the value of the thumbs property.
         *
         * @param value
         *     allowed object is
         *     {@link Byte }
         *
         */
        public void setThumbs(Byte value) {
            this.thumbs = value;
        }

        /**
         * Gets the value of the imageid property.
         *
         * @return
         *     possible object is
         *     {@link Integer }
         *
         */
        public Integer getImageid() {
            return imageid;
        }

        /**
         * Sets the value of the imageid property.
         *
         * @param value
         *     allowed object is
         *     {@link Integer }
         *
         */
        public void setImageid(Integer value) {
            this.imageid = value;
        }

    }

}
