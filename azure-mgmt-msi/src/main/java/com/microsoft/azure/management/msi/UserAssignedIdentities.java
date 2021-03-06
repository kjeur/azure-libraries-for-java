/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.msi;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for UserAssignedIdentities.
 */
public final class UserAssignedIdentities extends ExpandableStringEnum<UserAssignedIdentities> {
    /** Static value Microsoft.ManagedIdentity/userAssignedIdentities for UserAssignedIdentities. */
    public static final UserAssignedIdentities MICROSOFT_MANAGED_IDENTITYUSER_ASSIGNED_IDENTITIES = fromString("Microsoft.ManagedIdentity/userAssignedIdentities");

    /**
     * Creates or finds a UserAssignedIdentities from its string representation.
     * @param name a name to look for
     * @return the corresponding UserAssignedIdentities
     */
    @JsonCreator
    public static UserAssignedIdentities fromString(String name) {
        return fromString(name, UserAssignedIdentities.class);
    }

    /**
     * @return known UserAssignedIdentities values
     */
    public static Collection<UserAssignedIdentities> values() {
        return values(UserAssignedIdentities.class);
    }
}
