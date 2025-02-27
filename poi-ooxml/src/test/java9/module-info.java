/* ====================================================================
   Licensed to the Apache Software Foundation (ASF) under one or more
   contributor license agreements.  See the NOTICE file distributed with
   this work for additional information regarding copyright ownership.
   The ASF licenses this file to You under the Apache License, Version 2.0
   (the "License"); you may not use this file except in compliance with
   the License.  You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
==================================================================== */

module org.apache.poi.ooxml {
    requires transitive org.apache.poi.poi;
    requires transitive org.apache.xmlbeans;
    requires transitive org.apache.poi.ooxml.schemas;
    requires org.apache.commons.collections4;
    requires org.apache.commons.codec;
    requires org.apache.commons.compress;
    requires org.apache.commons.io;
    requires commons.math3;
    requires com.zaxxer.sparsebitset;
    requires org.apache.logging.log4j;
    requires java.logging;
    requires java.desktop;
    requires java.security.jgss;

    provides org.apache.poi.extractor.ExtractorProvider with org.apache.poi.ooxml.extractor.POIXMLExtractorFactory;
    provides org.apache.poi.ss.usermodel.WorkbookProvider with org.apache.poi.xssf.usermodel.XSSFWorkbookFactory;
    provides org.apache.poi.sl.usermodel.SlideShowProvider with org.apache.poi.xslf.usermodel.XSLFSlideShowFactory;
    provides org.apache.poi.sl.draw.ImageRenderer with org.apache.poi.xslf.draw.SVGImageRenderer;
    provides org.apache.poi.sl.usermodel.MetroShapeProvider with org.apache.poi.xslf.usermodel.XSLFMetroShape;

    exports org.apache.poi.xwpf.extractor;
    exports org.apache.poi.xwpf.usermodel;
    exports org.apache.poi.xwpf.model;
    exports org.apache.poi.xdgf.extractor;
    exports org.apache.poi.xdgf.exceptions;
    exports org.apache.poi.xdgf.usermodel;
    exports org.apache.poi.xdgf.usermodel.section;
    exports org.apache.poi.xdgf.usermodel.section.geometry;
    exports org.apache.poi.xdgf.usermodel.shape;
    exports org.apache.poi.xdgf.usermodel.shape.exceptions;
    exports org.apache.poi.xdgf.xml;
    exports org.apache.poi.xdgf.util;
    exports org.apache.poi.xdgf.geom;
    exports org.apache.poi.ooxml;
    exports org.apache.poi.ooxml.dev;
    exports org.apache.poi.ooxml.extractor;
    exports org.apache.poi.ooxml.util;
    exports org.apache.poi.xddf.usermodel;
    exports org.apache.poi.xddf.usermodel.text;
    exports org.apache.poi.xddf.usermodel.chart;
    exports org.apache.poi.openxml4j.exceptions;
    exports org.apache.poi.openxml4j.opc;
    exports org.apache.poi.openxml4j.opc.internal;
    exports org.apache.poi.openxml4j.opc.internal.marshallers;
    exports org.apache.poi.openxml4j.opc.internal.unmarshallers;
    exports org.apache.poi.openxml4j.util;
    exports org.apache.poi.xssf;
    exports org.apache.poi.xssf.extractor;
    exports org.apache.poi.xssf.eventusermodel;
    exports org.apache.poi.xssf.usermodel;
    exports org.apache.poi.xssf.usermodel.helpers;
    exports org.apache.poi.xssf.usermodel.extensions;
    exports org.apache.poi.xssf.binary;
    exports org.apache.poi.xssf.model;
    exports org.apache.poi.xssf.streaming;
    exports org.apache.poi.xssf.util;
    exports org.apache.poi.xslf.draw;
    exports org.apache.poi.xslf.draw.geom;
    exports org.apache.poi.xslf.usermodel;
    exports org.apache.poi.xslf.model;
    exports org.apache.poi.xslf.util;
    exports org.apache.poi.poifs.crypt.dsig;
    exports org.apache.poi.poifs.crypt.dsig.facets;
    exports org.apache.poi.poifs.crypt.dsig.services;
    exports org.apache.poi.poifs.crypt.temp;

    opens org.apache.poi.openxml4j.opc to org.apache.poi.poi, org.junit.platform.commons;
    opens org.apache.poi.openxml4j to org.apache.poi.ooxml, org.junit.platform.commons;


    /* optional dependencies for xml signatures - you need to add a require entry your module-info
     * or add them via the --add-modules JVM argument */
    requires java.xml.crypto;
    requires static org.apache.santuario.xmlsec;
    requires static org.bouncycastle.provider;
    requires static org.bouncycastle.pkix;


    /* optional dependencies for slideshow rendering via PPTX2PNG */
    requires static batik.anim;
    requires static batik.awt.util;
    requires static batik.bridge;
    requires static batik.codec;
    requires static batik.constants;
    requires static batik.css;
    requires static batik.dom;
    requires static batik.ext;
    requires static batik.gvt;
    requires static batik.i18n;
    requires static batik.parser;
    requires static batik.script;
    requires static batik.shared.resources;
    requires static batik.svg.dom;
    requires static batik.svggen;
    requires static batik.svgrasterizer;
    requires static batik.transcoder;
    requires static batik.util;
    requires static batik.xml;
    requires static xmlgraphics.commons;

    requires static org.apache.pdfbox;
    requires static org.apache.fontbox;
    requires static de.rototor.pdfbox.graphics2d;


    // test specific exports
    requires org.junit.jupiter.api;
    requires org.junit.jupiter.params;
    requires com.google.common;

    exports org.apache.poi.extractor.ooxml to org.junit.platform.commons;
    exports org.apache.poi.openxml4j.opc.compliance to org.junit.platform.commons;
    exports org.apache.poi.poifs.crypt.tests to org.junit.platform.commons;
    exports org.apache.poi.sl.tests to org.junit.platform.commons;
    exports org.apache.poi.sl.tests.draw to org.junit.platform.commons;
    exports org.apache.poi.ss.tests to org.junit.platform.commons;
    exports org.apache.poi.ss.tests.extractor to org.junit.platform.commons;
    exports org.apache.poi.ss.tests.format to org.junit.platform.commons;
    exports org.apache.poi.ss.tests.formula to org.junit.platform.commons;
    exports org.apache.poi.ss.tests.formula.eval to org.junit.platform.commons;
    exports org.apache.poi.ss.tests.formula.functions to org.junit.platform.commons;
    exports org.apache.poi.ss.tests.usermodel to org.junit.platform.commons;
    exports org.apache.poi.ss.tests.util to org.junit.platform.commons;
    exports org.apache.poi.util.tests to org.junit.platform.commons;
    exports org.apache.poi.xslf to org.junit.platform.commons;
    exports org.apache.poi.xslf.extractor to org.junit.platform.commons;
    exports org.apache.poi.xssf.io to org.junit.platform.commons;
    exports org.apache.poi.xssf.usermodel.charts to org.junit.platform.commons;
    exports org.apache.poi.xwpf to org.junit.platform.commons;

    opens org.apache.poi.extractor.ooxml to org.junit.platform.commons;
    opens org.apache.poi.openxml4j.opc.compliance to org.junit.platform.commons;
    opens org.apache.poi.poifs.crypt.tests to org.junit.platform.commons;
    opens org.apache.poi.sl.tests to org.junit.platform.commons;
    opens org.apache.poi.sl.tests.draw to org.junit.platform.commons;
    opens org.apache.poi.ss.tests to org.junit.platform.commons;
    opens org.apache.poi.ss.tests.extractor to org.junit.platform.commons;
    opens org.apache.poi.ss.tests.format to org.junit.platform.commons;
    opens org.apache.poi.ss.tests.formula to org.junit.platform.commons;
    opens org.apache.poi.ss.tests.formula.eval to org.junit.platform.commons;
    opens org.apache.poi.ss.tests.formula.functions to org.junit.platform.commons;
    opens org.apache.poi.ss.tests.usermodel to org.junit.platform.commons;
    opens org.apache.poi.ss.tests.util to org.junit.platform.commons;
    opens org.apache.poi.util.tests to org.junit.platform.commons;
    opens org.apache.poi.xslf to org.junit.platform.commons;
    opens org.apache.poi.xslf.extractor to org.junit.platform.commons;
    opens org.apache.poi.xssf.io to org.junit.platform.commons;
    opens org.apache.poi.xssf.usermodel.charts to org.junit.platform.commons;
    opens org.apache.poi.xwpf to org.junit.platform.commons;
    opens org.apache.poi.xwpf.extractor to org.junit.platform.commons;
    opens org.apache.poi.xwpf.usermodel to org.junit.platform.commons;
    opens org.apache.poi.xwpf.model to org.junit.platform.commons;
    opens org.apache.poi.xdgf.extractor to org.junit.platform.commons;
    opens org.apache.poi.xdgf.exceptions to org.junit.platform.commons;
    opens org.apache.poi.xdgf.usermodel to org.junit.platform.commons;
    opens org.apache.poi.xdgf.usermodel.section to org.junit.platform.commons;
    opens org.apache.poi.xdgf.usermodel.section.geometry to org.junit.platform.commons;
    opens org.apache.poi.xdgf.usermodel.shape to org.junit.platform.commons;
    opens org.apache.poi.xdgf.usermodel.shape.exceptions to org.junit.platform.commons;
    opens org.apache.poi.xdgf.xml to org.junit.platform.commons;
    opens org.apache.poi.xdgf.util to org.junit.platform.commons;
    opens org.apache.poi.xdgf.geom to org.junit.platform.commons;
    opens org.apache.poi.ooxml to org.junit.platform.commons;
    opens org.apache.poi.ooxml.dev to org.junit.platform.commons;
    opens org.apache.poi.ooxml.extractor to org.junit.platform.commons;
    opens org.apache.poi.ooxml.util to org.junit.platform.commons;
    opens org.apache.poi.xddf.usermodel to org.junit.platform.commons;
    opens org.apache.poi.xddf.usermodel.text to org.junit.platform.commons;
    opens org.apache.poi.xddf.usermodel.chart to org.junit.platform.commons;
    opens org.apache.poi.openxml4j.exceptions to org.junit.platform.commons;
    opens org.apache.poi.openxml4j.opc.internal to org.junit.platform.commons;
    opens org.apache.poi.openxml4j.opc.internal.marshallers to org.junit.platform.commons;
    opens org.apache.poi.openxml4j.opc.internal.unmarshallers to org.junit.platform.commons;
    opens org.apache.poi.openxml4j.util to org.junit.platform.commons;
    opens org.apache.poi.xssf to org.junit.platform.commons;
    opens org.apache.poi.xssf.extractor to org.junit.platform.commons;
    opens org.apache.poi.xssf.eventusermodel to org.junit.platform.commons;
    opens org.apache.poi.xssf.usermodel to org.junit.platform.commons;
    opens org.apache.poi.xssf.usermodel.helpers to org.junit.platform.commons;
    opens org.apache.poi.xssf.usermodel.extensions to org.junit.platform.commons;
    opens org.apache.poi.xssf.binary to org.junit.platform.commons;
    opens org.apache.poi.xssf.model to org.junit.platform.commons;
    opens org.apache.poi.xssf.streaming to org.junit.platform.commons;
    opens org.apache.poi.xssf.util to org.junit.platform.commons;
    opens org.apache.poi.xslf.draw to org.junit.platform.commons;
    opens org.apache.poi.xslf.usermodel to org.junit.platform.commons;
    opens org.apache.poi.xslf.model to org.junit.platform.commons;
    opens org.apache.poi.xslf.util to org.junit.platform.commons;
    opens org.apache.poi.poifs.crypt.dsig to org.junit.platform.commons;
    opens org.apache.poi.poifs.crypt.dsig.facets to org.junit.platform.commons;
    opens org.apache.poi.poifs.crypt.dsig.services to org.junit.platform.commons;
    opens org.apache.poi.poifs.crypt.temp to org.junit.platform.commons;
}