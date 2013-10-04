package hudson.plugins.buckminster.install;

import hudson.tools.DownloadFromUrlInstaller.Installable;

public class BuckminsterInstallable extends Installable {

    //in case it does not get initalized from JSON (shouldn't happen)
    public Repository[] repositories = new Repository[0];
    public String repositoryURL;
    public String iu;

    public Repository[] getRepositories() {
        return repositories;
    }

    public void setRepositories(Repository[] repositories) {
        this.repositories = repositories;
    }

    public String getRepositoryURL() {
        return repositoryURL;
    }

    public void setRepositoryURL(String repositoryURL) {
        this.repositoryURL = repositoryURL;
    }

    public String getIu() {
        return iu;
    }

    public void setIu(String iu) {
        this.iu = iu;
    }

    public static class Feature {

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }
        public String id;
    }

    public static class Repository {

        public String url;

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public Feature[] getFeatures() {
            return features;
        }

        public void setFeatures(Feature[] features) {
            this.features = features;
        }
        public Feature[] features;
    }

    public static class BuckminsterInstallableList {
        //in case it does not get initalized from JSON (shouldn't happen)

        public BuckminsterInstallable[] buckminsters = new BuckminsterInstallable[0];

        public BuckminsterInstallable[] getBuckminsters() {
            return buckminsters;
        }

        public void setBuckminsters(BuckminsterInstallable[] buckminsters) {
            this.buckminsters = buckminsters;
        }
    }
}
