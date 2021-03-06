package org.jfrog.artifactory.client.model;

import java.util.List;

/**
 * Created by Eyal BM on 30/11/2015.
 */
public interface StorageInfo {

    FileStorageSummary getFileStoreSummary();

    BinariesSummary getBinariesSummary();

    List<RepositorySummary> getRepositoriesSummaryList();

}
