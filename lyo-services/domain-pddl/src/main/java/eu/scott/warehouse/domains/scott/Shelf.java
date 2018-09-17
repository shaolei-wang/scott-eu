// Start of user code Copyright
/*******************************************************************************
 * Copyright (c) 2012 IBM Corporation and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Eclipse Distribution License v. 1.0 which accompanies this distribution.
 *
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 *
 *     Russell Boykin       - initial API and implementation
 *     Alberto Giammaria    - initial API and implementation
 *     Chris Peters         - initial API and implementation
 *     Gianluca Bernardini  - initial API and implementation
 *       Sam Padgett          - initial API and implementation
 *     Michael Fiedler      - adapted for OSLC4J
 *     Jad El-khoury        - initial implementation of code generator (422448)
 *     Matthieu Helleboid   - Support for multiple Service Providers.
 *     Anass Radouani       - Support for multiple Service Providers.
 *
 * This file is generated by org.eclipse.lyo.oslc4j.codegenerator
 *******************************************************************************/
// End of user code

package eu.scott.warehouse.domains.scott;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;
import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import javax.ws.rs.core.UriBuilder;

import org.eclipse.lyo.oslc4j.core.OSLC4JUtils;
import org.eclipse.lyo.oslc4j.core.exception.OslcCoreApplicationException;
import org.eclipse.lyo.oslc4j.core.annotation.OslcAllowedValue;
import org.eclipse.lyo.oslc4j.core.annotation.OslcDescription;
import org.eclipse.lyo.oslc4j.core.annotation.OslcMemberProperty;
import org.eclipse.lyo.oslc4j.core.annotation.OslcName;
import org.eclipse.lyo.oslc4j.core.annotation.OslcNamespace;
import org.eclipse.lyo.oslc4j.core.annotation.OslcOccurs;
import org.eclipse.lyo.oslc4j.core.annotation.OslcPropertyDefinition;
import org.eclipse.lyo.oslc4j.core.annotation.OslcRange;
import org.eclipse.lyo.oslc4j.core.annotation.OslcReadOnly;
import org.eclipse.lyo.oslc4j.core.annotation.OslcRepresentation;
import org.eclipse.lyo.oslc4j.core.annotation.OslcResourceShape;
import org.eclipse.lyo.oslc4j.core.annotation.OslcTitle;
import org.eclipse.lyo.oslc4j.core.annotation.OslcValueType;
import org.eclipse.lyo.oslc4j.core.model.AbstractResource;
import org.eclipse.lyo.oslc4j.core.model.Link;
import org.eclipse.lyo.oslc4j.core.model.Occurs;
import org.eclipse.lyo.oslc4j.core.model.OslcConstants;
import org.eclipse.lyo.oslc4j.core.model.Representation;
import org.eclipse.lyo.oslc4j.core.model.ValueType;
import org.eclipse.lyo.oslc4j.core.model.ResourceShape;
import org.eclipse.lyo.oslc4j.core.model.ResourceShapeFactory;

import eu.scott.warehouse.domains.scott.ScottDomainConstants;


import eu.scott.warehouse.domains.scott.ScottDomainConstants;
import eu.scott.warehouse.domains.scott.Coord;
import eu.scott.warehouse.domains.scott.Coord;

// Start of user code imports
// End of user code

// Start of user code preClassCode
// End of user code

// Start of user code classAnnotations
// End of user code
@OslcNamespace(ScottDomainConstants.SHELF_NAMESPACE)
@OslcName(ScottDomainConstants.SHELF_LOCALNAME)
@OslcResourceShape(title = "Shelf Resource Shape", describes = ScottDomainConstants.SHELF_TYPE)
public class Shelf
    extends AbstractResource
    implements IShelf
{
    // Start of user code attributeAnnotation:atX
    // End of user code
    private Link atX = new Link();
    // Start of user code attributeAnnotation:atY
    // End of user code
    private Link atY = new Link();
    
    // Start of user code classAttributes
    // End of user code
    // Start of user code classMethods
    // End of user code
    public Shelf()
           throws URISyntaxException
    {
        super();
    
        // Start of user code constructor1
        // End of user code
    }
    
    public Shelf(final URI about)
           throws URISyntaxException
    {
        super(about);
    
        // Start of user code constructor2
        // End of user code
    }
    
    
    public static ResourceShape createResourceShape() throws OslcCoreApplicationException, URISyntaxException {
        return ResourceShapeFactory.createResourceShape(OSLC4JUtils.getServletURI(),
        OslcConstants.PATH_RESOURCE_SHAPES,
        ScottDomainConstants.SHELF_PATH,
        Shelf.class);
    }
    
    
    public String toString()
    {
        return toString(false);
    }
    
    public String toString(boolean asLocalResource)
    {
        String result = "";
        // Start of user code toString_init
        // End of user code
    
        if (asLocalResource) {
            result = result + "{a Local Shelf Resource} - update Shelf.toString() to present resource as desired.";
            // Start of user code toString_bodyForLocalResource
            // End of user code
        }
        else {
            result = getAbout().toString();
        }
    
        // Start of user code toString_finalize
        // End of user code
    
        return result;
    }
    
    public String toHtml()
    {
        return toHtml(false);
    }
    
    public String toHtml(boolean asLocalResource)
    {
        String result = "";
        // Start of user code toHtml_init
        // End of user code
    
        if (asLocalResource) {
            result = toString(true);
            // Start of user code toHtml_bodyForLocalResource
            // End of user code
        }
        else {
            result = "<a href=\"" + getAbout() + "\" class=\"oslc-resource-link\">" + toString() + "</a>";
        }
    
        // Start of user code toHtml_finalize
        // End of user code
    
        return result;
    }
    
    
    // Start of user code getterAnnotation:atX
    // End of user code
    @OslcName("atX")
    @OslcPropertyDefinition(ScottDomainConstants.SCOTT_WAREHOUSE_NAMSPACE + "atX")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcValueType(ValueType.Resource)
    @OslcRange({ScottDomainConstants.COORD_TYPE})
    @OslcReadOnly(false)
    public Link getAtX()
    {
        // Start of user code getterInit:atX
        // End of user code
        return atX;
    }
    
    // Start of user code getterAnnotation:atY
    // End of user code
    @OslcName("atY")
    @OslcPropertyDefinition(ScottDomainConstants.SCOTT_WAREHOUSE_NAMSPACE + "atY")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcValueType(ValueType.Resource)
    @OslcRange({ScottDomainConstants.COORD_TYPE})
    @OslcReadOnly(false)
    public Link getAtY()
    {
        // Start of user code getterInit:atY
        // End of user code
        return atY;
    }
    
    
    // Start of user code setterAnnotation:atX
    // End of user code
    public void setAtX(final Link atX )
    {
        // Start of user code setterInit:atX
        // End of user code
        this.atX = atX;
    
        // Start of user code setterFinalize:atX
        // End of user code
    }
    
    // Start of user code setterAnnotation:atY
    // End of user code
    public void setAtY(final Link atY )
    {
        // Start of user code setterInit:atY
        // End of user code
        this.atY = atY;
    
        // Start of user code setterFinalize:atY
        // End of user code
    }
    
    
    static public String atXToHtmlForCreation (final HttpServletRequest httpServletRequest)
    {
        String s = "";
    
        // Start of user code "Init:atXToHtmlForCreation(...)"
        // End of user code
    
        s = s + "<label for=\"at-x\">at-x: </LABEL>";
    
        // Start of user code "Mid:atXToHtmlForCreation(...)"
        // End of user code
    
        // Start of user code "Finalize:atXToHtmlForCreation(...)"
        // End of user code
    
        return s;
    }
    
    static public String atYToHtmlForCreation (final HttpServletRequest httpServletRequest)
    {
        String s = "";
    
        // Start of user code "Init:atYToHtmlForCreation(...)"
        // End of user code
    
        s = s + "<label for=\"at-y\">at-y: </LABEL>";
    
        // Start of user code "Mid:atYToHtmlForCreation(...)"
        // End of user code
    
        // Start of user code "Finalize:atYToHtmlForCreation(...)"
        // End of user code
    
        return s;
    }
    
    
    public String atXToHtml()
    {
        String s = "";
    
        // Start of user code atXtoHtml_mid
        // End of user code
    
        try {
            if ((atX == null) || (atX.getValue() == null)) {
                s = s + "<em>null</em>";
            }
            else {
                s = s + (new Coord (atX.getValue())).toHtml(false);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    
        // Start of user code atXtoHtml_finalize
        // End of user code
    
        return s;
    }
    
    public String atYToHtml()
    {
        String s = "";
    
        // Start of user code atYtoHtml_mid
        // End of user code
    
        try {
            if ((atY == null) || (atY.getValue() == null)) {
                s = s + "<em>null</em>";
            }
            else {
                s = s + (new Coord (atY.getValue())).toHtml(false);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    
        // Start of user code atYtoHtml_finalize
        // End of user code
    
        return s;
    }
    
    
}
