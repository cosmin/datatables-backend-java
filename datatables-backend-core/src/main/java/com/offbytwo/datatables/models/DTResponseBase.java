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

public abstract class DTResponseBase {
    /**
     * The draw counter that this object is a response to - from the draw parameter sent as part of the data request.
     * Note that it is strongly recommended for security reasons that you cast this parameter to an integer, rather
     * than simply echoing back to the client what it sent in the draw parameter, in order to prevent
     * Cross Site Scripting (XSS) attacks.
     */
    private Integer draw = 0;

    /**
     * Total records, before filtering (i.e. the total number of records in the database)
     */
    private Integer recordsTotal = 0;

    /**
     * Total records, after filtering (i.e. the total number of records after filtering has been applied - not just the
     * number of records being returned for this page of data).
     */
    private Integer recordsFiltered = 0;

    /**
     * Optional: If an error occurs during the running of the server-side processing script, you can inform the user of
     * this error by passing back the error message to be displayed using this parameter.
     * Do not include if there is no error.
     */
    private String error;

    public DTResponseBase(Integer draw, Integer recordsTotal, Integer recordsFiltered) {
        this.draw = draw;
        this.recordsTotal = recordsTotal;
        this.recordsFiltered = recordsFiltered;
    }

    public DTResponseBase(Integer draw, Integer recordsTotal, Integer recordsFiltered, String error) {
        this.draw = draw;
        this.recordsTotal = recordsTotal;
        this.recordsFiltered = recordsFiltered;
        this.error = error;
    }

    public Integer getDraw() {
        return draw;
    }

    public void setDraw(Integer draw) {
        this.draw = draw;
    }

    public Integer getRecordsTotal() {
        return recordsTotal;
    }

    public void setRecordsTotal(Integer recordsTotal) {
        this.recordsTotal = recordsTotal;
    }

    public Integer getRecordsFiltered() {
        return recordsFiltered;
    }

    public void setRecordsFiltered(Integer recordsFiltered) {
        this.recordsFiltered = recordsFiltered;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DTResponseBase)) return false;

        DTResponseBase that = (DTResponseBase) o;

        if (!draw.equals(that.draw)) return false;
        if (!recordsTotal.equals(that.recordsTotal)) return false;
        if (!recordsFiltered.equals(that.recordsFiltered)) return false;
        return error.equals(that.error);

    }

    @Override
    public int hashCode() {
        int result = draw.hashCode();
        result = 31 * result + recordsTotal.hashCode();
        result = 31 * result + recordsFiltered.hashCode();
        result = 31 * result + error.hashCode();
        return result;
    }
}
