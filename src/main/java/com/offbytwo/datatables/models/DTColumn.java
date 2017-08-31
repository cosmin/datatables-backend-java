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

/**
 * Column specific for DataTables requests
 *
 * @see com.offbytwo.datatables.models.DTRequest
 */
public class DTColumn {
    /**
     * Column's data source, as defined by columns.data
     */
    String data;

    /**
     * Column's name, as defined by columns.name
     */
    String name;

    /**
     * Flag to indicate if this column is searchable (true) or not (false). This is controlled by columns.searchable
     */
    Boolean searchable;

    /**
     * Flag to indicate if this column is orderable (true) or not (false). This is controlled by columns.orderable
     */
    Boolean orderable;

    /**
     * Search to apply to this specific column
     *
     * @see com.offbytwo.datatables.models.DTSearch
     */
    DTSearch search;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getSearchable() {
        return searchable;
    }

    public void setSearchable(Boolean searchable) {
        this.searchable = searchable;
    }

    public Boolean getOrderable() {
        return orderable;
    }

    public void setOrderable(Boolean orderable) {
        this.orderable = orderable;
    }

    public DTSearch getSearch() {
        return search;
    }

    public void setSearch(DTSearch search) {
        this.search = search;
    }
}
