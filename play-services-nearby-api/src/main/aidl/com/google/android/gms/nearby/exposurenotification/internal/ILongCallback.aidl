/*
 * SPDX-FileCopyrightText: 2020, microG Project Team
 * SPDX-License-Identifier: Apache-2.0
 */

package com.google.android.gms.nearby.exposurenotification.internal;

import com.google.android.gms.common.api.Status;

interface ILongCallback {
    void onResult(in Status status, long result);
}
