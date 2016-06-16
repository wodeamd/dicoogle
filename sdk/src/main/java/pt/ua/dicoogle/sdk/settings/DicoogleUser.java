/**
 * Copyright (C) 2014  Universidade de Aveiro, DETI/IEETA, Bioinformatics Group - http://bioinformatics.ua.pt/
 *
 * This file is part of Dicoogle/dicoogle-sdk.
 *
 * Dicoogle/dicoogle-sdk is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Dicoogle/dicoogle-sdk is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Dicoogle.  If not, see <http://www.gnu.org/licenses/>.
 */
package pt.ua.dicoogle.sdk.settings;

import java.util.Collection;
import java.util.Map;

/** Interface for obtaining information about a registered Dicoogle user.
 * @author Eduardo Pinho <eduardopinho@ua.pt>
 */
public interface DicoogleUser {

    /** Obtain the user's name.
     * @return the unique name identifying the user
     */
    public String getUsername();

    public boolean isAdmin();

    /** Obtain the user's associated roles.
     *
     * @return a list of role identifiers
     */
    public Collection<String> getRoles();

    public boolean hasRole(String rolename);

    public Map<String, Object> getUserContent();
}
