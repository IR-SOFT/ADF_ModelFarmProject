package model.lov;

import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Jan 28 16:10:00 PKT 2019
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class Pages_Name_LOVRowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        PagesId,
        PagesName;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        protected int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        protected static final int firstIndex() {
            return firstIndex;
        }

        protected static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        protected static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }
    public static final int PAGESID = AttributesEnum.PagesId.index();
    public static final int PAGESNAME = AttributesEnum.PagesName.index();

    /**
     * This is the default constructor (do not remove).
     */
    public Pages_Name_LOVRowImpl() {
    }
}

