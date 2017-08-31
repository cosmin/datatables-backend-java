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
 * Order params for DataTables server-side requests.
 *
 * @see com.offbytwo.datatables.models.DTRequest
 */
public class DTOrdering {
    /**
     * Column to which ordering should be applied. This is an index reference to the columns array of information
     * that is also submitted to the server.
     */
    private Integer column;

    /**
     * Ordering direction for this column. It will be {@link com.offbytwo.datatables.models.DTOrdering.Value#asc} or
     * {@link com.offbytwo.datatables.models.DTOrdering.Value#desc} to indicate ascending ordering or
     * descending ordering, respectively.
     */
    private Value dir;

    public DTOrdering() {
    }

    public DTOrdering(Integer column, Value dir) {
        this.column = column;
        this.dir = dir;
    }

    public Integer getColumn() {
        return column;
    }

    public void setColumn(Integer column) {
        this.column = column;
    }

    public Value getDir() {
        return dir;
    }

    public void setDir(Value dir) {
        this.dir = dir;
    }

    public enum Value {
        asc,
        desc
    }
}
