/*
 * Copyright (c) 2016 Cosmin Stejerean
 *
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.offbytwo.datatables.models;

import java.util.ArrayList;
import java.util.List;

public class DTResponseSimple extends DTResponseBase {
    /**
     * The data to be displayed in the table. This is an array of data source objects, one for each row, which will be
     * used by DataTables. Note that this parameter's name can be changed using the ajax option's dataSrc property.
     */
    private List<Object[]> data = new ArrayList<Object[]>();

    public DTResponseSimple(Integer draw, Integer recordsTotal, Integer recordsFiltered, List<Object[]> data) {
        super(draw, recordsTotal, recordsFiltered);
        this.data = data;
    }

    public DTResponseSimple(Integer draw, Integer recordsTotal, Integer recordsFiltered, List<Object[]> data, String error) {
        super(draw, recordsTotal, recordsFiltered, error);
        this.data = data;
    }

    public List<Object[]> getData() {
        return data;
    }

    public void setData(List<Object[]> data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DTResponseSimple)) return false;
        if (!super.equals(o)) return false;

        DTResponseSimple that = (DTResponseSimple) o;

        return data.equals(that.data) && super.equals(that);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + data.hashCode();
        return result;
    }
}
