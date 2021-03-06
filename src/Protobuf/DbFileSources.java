package Protobuf;

public final class DbFileSources {
    private DbFileSources() {}
    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistryLite registry) {
    }

    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions(
                (com.google.protobuf.ExtensionRegistryLite) registry);
    }
    public interface LineOrBuilder extends
            // @@protoc_insertion_point(interface_extends:com.linio.sonarqube.source.db.Line)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>optional int32 line = 1;</code>
         */
        boolean hasLine();
        /**
         * <code>optional int32 line = 1;</code>
         */
        int getLine();

        /**
         * <code>optional string source = 2;</code>
         */
        boolean hasSource();
        /**
         * <code>optional string source = 2;</code>
         */
        java.lang.String getSource();
        /**
         * <code>optional string source = 2;</code>
         */
        com.google.protobuf.ByteString
        getSourceBytes();

        /**
         * <pre>
         * SCM
         * </pre>
         *
         * <code>optional string scm_revision = 3;</code>
         */
        boolean hasScmRevision();
        /**
         * <pre>
         * SCM
         * </pre>
         *
         * <code>optional string scm_revision = 3;</code>
         */
        java.lang.String getScmRevision();
        /**
         * <pre>
         * SCM
         * </pre>
         *
         * <code>optional string scm_revision = 3;</code>
         */
        com.google.protobuf.ByteString
        getScmRevisionBytes();

        /**
         * <code>optional string scm_author = 4;</code>
         */
        boolean hasScmAuthor();
        /**
         * <code>optional string scm_author = 4;</code>
         */
        java.lang.String getScmAuthor();
        /**
         * <code>optional string scm_author = 4;</code>
         */
        com.google.protobuf.ByteString
        getScmAuthorBytes();

        /**
         * <code>optional int64 scm_date = 5;</code>
         */
        boolean hasScmDate();
        /**
         * <code>optional int64 scm_date = 5;</code>
         */
        long getScmDate();

        /**
         * <pre>
         * Deprecated fields in 6.2 (has been deprecated when merging coverage into a single metric)
         * They are still used to read coverage info from sources that have not be re-analyzed
         * </pre>
         *
         * <code>optional int32 deprecated_ut_line_hits = 6;</code>
         */
        boolean hasDeprecatedUtLineHits();
        /**
         * <pre>
         * Deprecated fields in 6.2 (has been deprecated when merging coverage into a single metric)
         * They are still used to read coverage info from sources that have not be re-analyzed
         * </pre>
         *
         * <code>optional int32 deprecated_ut_line_hits = 6;</code>
         */
        int getDeprecatedUtLineHits();

        /**
         * <code>optional int32 deprecated_ut_conditions = 7;</code>
         */
        boolean hasDeprecatedUtConditions();
        /**
         * <code>optional int32 deprecated_ut_conditions = 7;</code>
         */
        int getDeprecatedUtConditions();

        /**
         * <code>optional int32 deprecated_ut_covered_conditions = 8;</code>
         */
        boolean hasDeprecatedUtCoveredConditions();
        /**
         * <code>optional int32 deprecated_ut_covered_conditions = 8;</code>
         */
        int getDeprecatedUtCoveredConditions();

        /**
         * <code>optional int32 deprecated_it_line_hits = 9;</code>
         */
        boolean hasDeprecatedItLineHits();
        /**
         * <code>optional int32 deprecated_it_line_hits = 9;</code>
         */
        int getDeprecatedItLineHits();

        /**
         * <code>optional int32 deprecated_it_conditions = 10;</code>
         */
        boolean hasDeprecatedItConditions();
        /**
         * <code>optional int32 deprecated_it_conditions = 10;</code>
         */
        int getDeprecatedItConditions();

        /**
         * <code>optional int32 deprecated_it_covered_conditions = 11;</code>
         */
        boolean hasDeprecatedItCoveredConditions();
        /**
         * <code>optional int32 deprecated_it_covered_conditions = 11;</code>
         */
        int getDeprecatedItCoveredConditions();

        /**
         * <code>optional int32 deprecated_overall_line_hits = 12;</code>
         */
        boolean hasDeprecatedOverallLineHits();
        /**
         * <code>optional int32 deprecated_overall_line_hits = 12;</code>
         */
        int getDeprecatedOverallLineHits();

        /**
         * <code>optional int32 deprecated_overall_conditions = 13;</code>
         */
        boolean hasDeprecatedOverallConditions();
        /**
         * <code>optional int32 deprecated_overall_conditions = 13;</code>
         */
        int getDeprecatedOverallConditions();

        /**
         * <code>optional int32 deprecated_overall_covered_conditions = 14;</code>
         */
        boolean hasDeprecatedOverallCoveredConditions();
        /**
         * <code>optional int32 deprecated_overall_covered_conditions = 14;</code>
         */
        int getDeprecatedOverallCoveredConditions();

        /**
         * <code>optional string highlighting = 15;</code>
         */
        boolean hasHighlighting();
        /**
         * <code>optional string highlighting = 15;</code>
         */
        java.lang.String getHighlighting();
        /**
         * <code>optional string highlighting = 15;</code>
         */
        com.google.protobuf.ByteString
        getHighlightingBytes();

        /**
         * <code>optional string symbols = 16;</code>
         */
        boolean hasSymbols();
        /**
         * <code>optional string symbols = 16;</code>
         */
        java.lang.String getSymbols();
        /**
         * <code>optional string symbols = 16;</code>
         */
        com.google.protobuf.ByteString
        getSymbolsBytes();

        /**
         * <code>repeated int32 duplication = 17 [packed = true];</code>
         */
        java.util.List<java.lang.Integer> getDuplicationList();
        /**
         * <code>repeated int32 duplication = 17 [packed = true];</code>
         */
        int getDuplicationCount();
        /**
         * <code>repeated int32 duplication = 17 [packed = true];</code>
         */
        int getDuplication(int index);

        /**
         * <pre>
         * coverage info (since 6.2)
         * </pre>
         *
         * <code>optional int32 line_hits = 18;</code>
         */
        boolean hasLineHits();
        /**
         * <pre>
         * coverage info (since 6.2)
         * </pre>
         *
         * <code>optional int32 line_hits = 18;</code>
         */
        int getLineHits();

        /**
         * <code>optional int32 conditions = 19;</code>
         */
        boolean hasConditions();
        /**
         * <code>optional int32 conditions = 19;</code>
         */
        int getConditions();

        /**
         * <code>optional int32 covered_conditions = 20;</code>
         */
        boolean hasCoveredConditions();
        /**
         * <code>optional int32 covered_conditions = 20;</code>
         */
        int getCoveredConditions();
    }
    /**
     * Protobuf type {@code com.linio.sonarqube.source.db.Line}
     */
    public  static final class Line extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:com.linio.sonarqube.source.db.Line)
            LineOrBuilder {
        // Use Line.newBuilder() to construct.
        private Line(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }
        private Line() {
            line_ = 0;
            source_ = "";
            scmRevision_ = "";
            scmAuthor_ = "";
            scmDate_ = 0L;
            deprecatedUtLineHits_ = 0;
            deprecatedUtConditions_ = 0;
            deprecatedUtCoveredConditions_ = 0;
            deprecatedItLineHits_ = 0;
            deprecatedItConditions_ = 0;
            deprecatedItCoveredConditions_ = 0;
            deprecatedOverallLineHits_ = 0;
            deprecatedOverallConditions_ = 0;
            deprecatedOverallCoveredConditions_ = 0;
            highlighting_ = "";
            symbols_ = "";
            duplication_ = java.util.Collections.emptyList();
            lineHits_ = 0;
            conditions_ = 0;
            coveredConditions_ = 0;
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }
        private Line(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            int mutable_bitField0_ = 0;
            com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                    com.google.protobuf.UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        default: {
                            if (!parseUnknownField(input, unknownFields,
                                    extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                        case 8: {
                            bitField0_ |= 0x00000001;
                            line_ = input.readInt32();
                            break;
                        }
                        case 18: {
                            com.google.protobuf.ByteString bs = input.readBytes();
                            bitField0_ |= 0x00000002;
                            source_ = bs;
                            break;
                        }
                        case 26: {
                            com.google.protobuf.ByteString bs = input.readBytes();
                            bitField0_ |= 0x00000004;
                            scmRevision_ = bs;
                            break;
                        }
                        case 34: {
                            com.google.protobuf.ByteString bs = input.readBytes();
                            bitField0_ |= 0x00000008;
                            scmAuthor_ = bs;
                            break;
                        }
                        case 40: {
                            bitField0_ |= 0x00000010;
                            scmDate_ = input.readInt64();
                            break;
                        }
                        case 48: {
                            bitField0_ |= 0x00000020;
                            deprecatedUtLineHits_ = input.readInt32();
                            break;
                        }
                        case 56: {
                            bitField0_ |= 0x00000040;
                            deprecatedUtConditions_ = input.readInt32();
                            break;
                        }
                        case 64: {
                            bitField0_ |= 0x00000080;
                            deprecatedUtCoveredConditions_ = input.readInt32();
                            break;
                        }
                        case 72: {
                            bitField0_ |= 0x00000100;
                            deprecatedItLineHits_ = input.readInt32();
                            break;
                        }
                        case 80: {
                            bitField0_ |= 0x00000200;
                            deprecatedItConditions_ = input.readInt32();
                            break;
                        }
                        case 88: {
                            bitField0_ |= 0x00000400;
                            deprecatedItCoveredConditions_ = input.readInt32();
                            break;
                        }
                        case 96: {
                            bitField0_ |= 0x00000800;
                            deprecatedOverallLineHits_ = input.readInt32();
                            break;
                        }
                        case 104: {
                            bitField0_ |= 0x00001000;
                            deprecatedOverallConditions_ = input.readInt32();
                            break;
                        }
                        case 112: {
                            bitField0_ |= 0x00002000;
                            deprecatedOverallCoveredConditions_ = input.readInt32();
                            break;
                        }
                        case 122: {
                            com.google.protobuf.ByteString bs = input.readBytes();
                            bitField0_ |= 0x00004000;
                            highlighting_ = bs;
                            break;
                        }
                        case 130: {
                            com.google.protobuf.ByteString bs = input.readBytes();
                            bitField0_ |= 0x00008000;
                            symbols_ = bs;
                            break;
                        }
                        case 136: {
                            if (!((mutable_bitField0_ & 0x00010000) == 0x00010000)) {
                                duplication_ = new java.util.ArrayList<java.lang.Integer>();
                                mutable_bitField0_ |= 0x00010000;
                            }
                            duplication_.add(input.readInt32());
                            break;
                        }
                        case 138: {
                            int length = input.readRawVarint32();
                            int limit = input.pushLimit(length);
                            if (!((mutable_bitField0_ & 0x00010000) == 0x00010000) && input.getBytesUntilLimit() > 0) {
                                duplication_ = new java.util.ArrayList<java.lang.Integer>();
                                mutable_bitField0_ |= 0x00010000;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                duplication_.add(input.readInt32());
                            }
                            input.popLimit(limit);
                            break;
                        }
                        case 144: {
                            bitField0_ |= 0x00010000;
                            lineHits_ = input.readInt32();
                            break;
                        }
                        case 152: {
                            bitField0_ |= 0x00020000;
                            conditions_ = input.readInt32();
                            break;
                        }
                        case 160: {
                            bitField0_ |= 0x00040000;
                            coveredConditions_ = input.readInt32();
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e).setUnfinishedMessage(this);
            } finally {
                if (((mutable_bitField0_ & 0x00010000) == 0x00010000)) {
                    duplication_ = java.util.Collections.unmodifiableList(duplication_);
                }
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return DbFileSources.internal_static_com_linio_sonarqube_source_db_Line_descriptor;
        }

        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return DbFileSources.internal_static_com_linio_sonarqube_source_db_Line_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            DbFileSources.Line.class, DbFileSources.Line.Builder.class);
        }

        private int bitField0_;
        public static final int LINE_FIELD_NUMBER = 1;
        private int line_;
        /**
         * <code>optional int32 line = 1;</code>
         */
        public boolean hasLine() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }
        /**
         * <code>optional int32 line = 1;</code>
         */
        public int getLine() {
            return line_;
        }

        public static final int SOURCE_FIELD_NUMBER = 2;
        private volatile java.lang.Object source_;
        /**
         * <code>optional string source = 2;</code>
         */
        public boolean hasSource() {
            return ((bitField0_ & 0x00000002) == 0x00000002);
        }
        /**
         * <code>optional string source = 2;</code>
         */
        public java.lang.String getSource() {
            java.lang.Object ref = source_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                    source_ = s;
                }
                return s;
            }
        }
        /**
         * <code>optional string source = 2;</code>
         */
        public com.google.protobuf.ByteString
        getSourceBytes() {
            java.lang.Object ref = source_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                source_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int SCM_REVISION_FIELD_NUMBER = 3;
        private volatile java.lang.Object scmRevision_;
        /**
         * <pre>
         * SCM
         * </pre>
         *
         * <code>optional string scm_revision = 3;</code>
         */
        public boolean hasScmRevision() {
            return ((bitField0_ & 0x00000004) == 0x00000004);
        }
        /**
         * <pre>
         * SCM
         * </pre>
         *
         * <code>optional string scm_revision = 3;</code>
         */
        public java.lang.String getScmRevision() {
            java.lang.Object ref = scmRevision_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                    scmRevision_ = s;
                }
                return s;
            }
        }
        /**
         * <pre>
         * SCM
         * </pre>
         *
         * <code>optional string scm_revision = 3;</code>
         */
        public com.google.protobuf.ByteString
        getScmRevisionBytes() {
            java.lang.Object ref = scmRevision_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                scmRevision_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int SCM_AUTHOR_FIELD_NUMBER = 4;
        private volatile java.lang.Object scmAuthor_;
        /**
         * <code>optional string scm_author = 4;</code>
         */
        public boolean hasScmAuthor() {
            return ((bitField0_ & 0x00000008) == 0x00000008);
        }
        /**
         * <code>optional string scm_author = 4;</code>
         */
        public java.lang.String getScmAuthor() {
            java.lang.Object ref = scmAuthor_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                    scmAuthor_ = s;
                }
                return s;
            }
        }
        /**
         * <code>optional string scm_author = 4;</code>
         */
        public com.google.protobuf.ByteString
        getScmAuthorBytes() {
            java.lang.Object ref = scmAuthor_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                scmAuthor_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int SCM_DATE_FIELD_NUMBER = 5;
        private long scmDate_;
        /**
         * <code>optional int64 scm_date = 5;</code>
         */
        public boolean hasScmDate() {
            return ((bitField0_ & 0x00000010) == 0x00000010);
        }
        /**
         * <code>optional int64 scm_date = 5;</code>
         */
        public long getScmDate() {
            return scmDate_;
        }

        public static final int DEPRECATED_UT_LINE_HITS_FIELD_NUMBER = 6;
        private int deprecatedUtLineHits_;
        /**
         * <pre>
         * Deprecated fields in 6.2 (has been deprecated when merging coverage into a single metric)
         * They are still used to read coverage info from sources that have not be re-analyzed
         * </pre>
         *
         * <code>optional int32 deprecated_ut_line_hits = 6;</code>
         */
        public boolean hasDeprecatedUtLineHits() {
            return ((bitField0_ & 0x00000020) == 0x00000020);
        }
        /**
         * <pre>
         * Deprecated fields in 6.2 (has been deprecated when merging coverage into a single metric)
         * They are still used to read coverage info from sources that have not be re-analyzed
         * </pre>
         *
         * <code>optional int32 deprecated_ut_line_hits = 6;</code>
         */
        public int getDeprecatedUtLineHits() {
            return deprecatedUtLineHits_;
        }

        public static final int DEPRECATED_UT_CONDITIONS_FIELD_NUMBER = 7;
        private int deprecatedUtConditions_;
        /**
         * <code>optional int32 deprecated_ut_conditions = 7;</code>
         */
        public boolean hasDeprecatedUtConditions() {
            return ((bitField0_ & 0x00000040) == 0x00000040);
        }
        /**
         * <code>optional int32 deprecated_ut_conditions = 7;</code>
         */
        public int getDeprecatedUtConditions() {
            return deprecatedUtConditions_;
        }

        public static final int DEPRECATED_UT_COVERED_CONDITIONS_FIELD_NUMBER = 8;
        private int deprecatedUtCoveredConditions_;
        /**
         * <code>optional int32 deprecated_ut_covered_conditions = 8;</code>
         */
        public boolean hasDeprecatedUtCoveredConditions() {
            return ((bitField0_ & 0x00000080) == 0x00000080);
        }
        /**
         * <code>optional int32 deprecated_ut_covered_conditions = 8;</code>
         */
        public int getDeprecatedUtCoveredConditions() {
            return deprecatedUtCoveredConditions_;
        }

        public static final int DEPRECATED_IT_LINE_HITS_FIELD_NUMBER = 9;
        private int deprecatedItLineHits_;
        /**
         * <code>optional int32 deprecated_it_line_hits = 9;</code>
         */
        public boolean hasDeprecatedItLineHits() {
            return ((bitField0_ & 0x00000100) == 0x00000100);
        }
        /**
         * <code>optional int32 deprecated_it_line_hits = 9;</code>
         */
        public int getDeprecatedItLineHits() {
            return deprecatedItLineHits_;
        }

        public static final int DEPRECATED_IT_CONDITIONS_FIELD_NUMBER = 10;
        private int deprecatedItConditions_;
        /**
         * <code>optional int32 deprecated_it_conditions = 10;</code>
         */
        public boolean hasDeprecatedItConditions() {
            return ((bitField0_ & 0x00000200) == 0x00000200);
        }
        /**
         * <code>optional int32 deprecated_it_conditions = 10;</code>
         */
        public int getDeprecatedItConditions() {
            return deprecatedItConditions_;
        }

        public static final int DEPRECATED_IT_COVERED_CONDITIONS_FIELD_NUMBER = 11;
        private int deprecatedItCoveredConditions_;
        /**
         * <code>optional int32 deprecated_it_covered_conditions = 11;</code>
         */
        public boolean hasDeprecatedItCoveredConditions() {
            return ((bitField0_ & 0x00000400) == 0x00000400);
        }
        /**
         * <code>optional int32 deprecated_it_covered_conditions = 11;</code>
         */
        public int getDeprecatedItCoveredConditions() {
            return deprecatedItCoveredConditions_;
        }

        public static final int DEPRECATED_OVERALL_LINE_HITS_FIELD_NUMBER = 12;
        private int deprecatedOverallLineHits_;
        /**
         * <code>optional int32 deprecated_overall_line_hits = 12;</code>
         */
        public boolean hasDeprecatedOverallLineHits() {
            return ((bitField0_ & 0x00000800) == 0x00000800);
        }
        /**
         * <code>optional int32 deprecated_overall_line_hits = 12;</code>
         */
        public int getDeprecatedOverallLineHits() {
            return deprecatedOverallLineHits_;
        }

        public static final int DEPRECATED_OVERALL_CONDITIONS_FIELD_NUMBER = 13;
        private int deprecatedOverallConditions_;
        /**
         * <code>optional int32 deprecated_overall_conditions = 13;</code>
         */
        public boolean hasDeprecatedOverallConditions() {
            return ((bitField0_ & 0x00001000) == 0x00001000);
        }
        /**
         * <code>optional int32 deprecated_overall_conditions = 13;</code>
         */
        public int getDeprecatedOverallConditions() {
            return deprecatedOverallConditions_;
        }

        public static final int DEPRECATED_OVERALL_COVERED_CONDITIONS_FIELD_NUMBER = 14;
        private int deprecatedOverallCoveredConditions_;
        /**
         * <code>optional int32 deprecated_overall_covered_conditions = 14;</code>
         */
        public boolean hasDeprecatedOverallCoveredConditions() {
            return ((bitField0_ & 0x00002000) == 0x00002000);
        }
        /**
         * <code>optional int32 deprecated_overall_covered_conditions = 14;</code>
         */
        public int getDeprecatedOverallCoveredConditions() {
            return deprecatedOverallCoveredConditions_;
        }

        public static final int HIGHLIGHTING_FIELD_NUMBER = 15;
        private volatile java.lang.Object highlighting_;
        /**
         * <code>optional string highlighting = 15;</code>
         */
        public boolean hasHighlighting() {
            return ((bitField0_ & 0x00004000) == 0x00004000);
        }
        /**
         * <code>optional string highlighting = 15;</code>
         */
        public java.lang.String getHighlighting() {
            java.lang.Object ref = highlighting_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                    highlighting_ = s;
                }
                return s;
            }
        }
        /**
         * <code>optional string highlighting = 15;</code>
         */
        public com.google.protobuf.ByteString
        getHighlightingBytes() {
            java.lang.Object ref = highlighting_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                highlighting_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int SYMBOLS_FIELD_NUMBER = 16;
        private volatile java.lang.Object symbols_;
        /**
         * <code>optional string symbols = 16;</code>
         */
        public boolean hasSymbols() {
            return ((bitField0_ & 0x00008000) == 0x00008000);
        }
        /**
         * <code>optional string symbols = 16;</code>
         */
        public java.lang.String getSymbols() {
            java.lang.Object ref = symbols_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                    symbols_ = s;
                }
                return s;
            }
        }
        /**
         * <code>optional string symbols = 16;</code>
         */
        public com.google.protobuf.ByteString
        getSymbolsBytes() {
            java.lang.Object ref = symbols_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                symbols_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int DUPLICATION_FIELD_NUMBER = 17;
        private java.util.List<java.lang.Integer> duplication_;
        /**
         * <code>repeated int32 duplication = 17 [packed = true];</code>
         */
        public java.util.List<java.lang.Integer>
        getDuplicationList() {
            return duplication_;
        }
        /**
         * <code>repeated int32 duplication = 17 [packed = true];</code>
         */
        public int getDuplicationCount() {
            return duplication_.size();
        }
        /**
         * <code>repeated int32 duplication = 17 [packed = true];</code>
         */
        public int getDuplication(int index) {
            return duplication_.get(index);
        }
        private int duplicationMemoizedSerializedSize = -1;

        public static final int LINE_HITS_FIELD_NUMBER = 18;
        private int lineHits_;
        /**
         * <pre>
         * coverage info (since 6.2)
         * </pre>
         *
         * <code>optional int32 line_hits = 18;</code>
         */
        public boolean hasLineHits() {
            return ((bitField0_ & 0x00010000) == 0x00010000);
        }
        /**
         * <pre>
         * coverage info (since 6.2)
         * </pre>
         *
         * <code>optional int32 line_hits = 18;</code>
         */
        public int getLineHits() {
            return lineHits_;
        }

        public static final int CONDITIONS_FIELD_NUMBER = 19;
        private int conditions_;
        /**
         * <code>optional int32 conditions = 19;</code>
         */
        public boolean hasConditions() {
            return ((bitField0_ & 0x00020000) == 0x00020000);
        }
        /**
         * <code>optional int32 conditions = 19;</code>
         */
        public int getConditions() {
            return conditions_;
        }

        public static final int COVERED_CONDITIONS_FIELD_NUMBER = 20;
        private int coveredConditions_;
        /**
         * <code>optional int32 covered_conditions = 20;</code>
         */
        public boolean hasCoveredConditions() {
            return ((bitField0_ & 0x00040000) == 0x00040000);
        }
        /**
         * <code>optional int32 covered_conditions = 20;</code>
         */
        public int getCoveredConditions() {
            return coveredConditions_;
        }

        private byte memoizedIsInitialized = -1;
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            getSerializedSize();
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                output.writeInt32(1, line_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 2, source_);
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 3, scmRevision_);
            }
            if (((bitField0_ & 0x00000008) == 0x00000008)) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 4, scmAuthor_);
            }
            if (((bitField0_ & 0x00000010) == 0x00000010)) {
                output.writeInt64(5, scmDate_);
            }
            if (((bitField0_ & 0x00000020) == 0x00000020)) {
                output.writeInt32(6, deprecatedUtLineHits_);
            }
            if (((bitField0_ & 0x00000040) == 0x00000040)) {
                output.writeInt32(7, deprecatedUtConditions_);
            }
            if (((bitField0_ & 0x00000080) == 0x00000080)) {
                output.writeInt32(8, deprecatedUtCoveredConditions_);
            }
            if (((bitField0_ & 0x00000100) == 0x00000100)) {
                output.writeInt32(9, deprecatedItLineHits_);
            }
            if (((bitField0_ & 0x00000200) == 0x00000200)) {
                output.writeInt32(10, deprecatedItConditions_);
            }
            if (((bitField0_ & 0x00000400) == 0x00000400)) {
                output.writeInt32(11, deprecatedItCoveredConditions_);
            }
            if (((bitField0_ & 0x00000800) == 0x00000800)) {
                output.writeInt32(12, deprecatedOverallLineHits_);
            }
            if (((bitField0_ & 0x00001000) == 0x00001000)) {
                output.writeInt32(13, deprecatedOverallConditions_);
            }
            if (((bitField0_ & 0x00002000) == 0x00002000)) {
                output.writeInt32(14, deprecatedOverallCoveredConditions_);
            }
            if (((bitField0_ & 0x00004000) == 0x00004000)) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 15, highlighting_);
            }
            if (((bitField0_ & 0x00008000) == 0x00008000)) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 16, symbols_);
            }
            if (getDuplicationList().size() > 0) {
                output.writeUInt32NoTag(138);
                output.writeUInt32NoTag(duplicationMemoizedSerializedSize);
            }
            for (int i = 0; i < duplication_.size(); i++) {
                output.writeInt32NoTag(duplication_.get(i));
            }
            if (((bitField0_ & 0x00010000) == 0x00010000)) {
                output.writeInt32(18, lineHits_);
            }
            if (((bitField0_ & 0x00020000) == 0x00020000)) {
                output.writeInt32(19, conditions_);
            }
            if (((bitField0_ & 0x00040000) == 0x00040000)) {
                output.writeInt32(20, coveredConditions_);
            }
            unknownFields.writeTo(output);
        }

        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(1, line_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, source_);
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, scmRevision_);
            }
            if (((bitField0_ & 0x00000008) == 0x00000008)) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, scmAuthor_);
            }
            if (((bitField0_ & 0x00000010) == 0x00000010)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt64Size(5, scmDate_);
            }
            if (((bitField0_ & 0x00000020) == 0x00000020)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(6, deprecatedUtLineHits_);
            }
            if (((bitField0_ & 0x00000040) == 0x00000040)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(7, deprecatedUtConditions_);
            }
            if (((bitField0_ & 0x00000080) == 0x00000080)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(8, deprecatedUtCoveredConditions_);
            }
            if (((bitField0_ & 0x00000100) == 0x00000100)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(9, deprecatedItLineHits_);
            }
            if (((bitField0_ & 0x00000200) == 0x00000200)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(10, deprecatedItConditions_);
            }
            if (((bitField0_ & 0x00000400) == 0x00000400)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(11, deprecatedItCoveredConditions_);
            }
            if (((bitField0_ & 0x00000800) == 0x00000800)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(12, deprecatedOverallLineHits_);
            }
            if (((bitField0_ & 0x00001000) == 0x00001000)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(13, deprecatedOverallConditions_);
            }
            if (((bitField0_ & 0x00002000) == 0x00002000)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(14, deprecatedOverallCoveredConditions_);
            }
            if (((bitField0_ & 0x00004000) == 0x00004000)) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(15, highlighting_);
            }
            if (((bitField0_ & 0x00008000) == 0x00008000)) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(16, symbols_);
            }
            {
                int dataSize = 0;
                for (int i = 0; i < duplication_.size(); i++) {
                    dataSize += com.google.protobuf.CodedOutputStream
                            .computeInt32SizeNoTag(duplication_.get(i));
                }
                size += dataSize;
                if (!getDuplicationList().isEmpty()) {
                    size += 2;
                    size += com.google.protobuf.CodedOutputStream
                            .computeInt32SizeNoTag(dataSize);
                }
                duplicationMemoizedSerializedSize = dataSize;
            }
            if (((bitField0_ & 0x00010000) == 0x00010000)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(18, lineHits_);
            }
            if (((bitField0_ & 0x00020000) == 0x00020000)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(19, conditions_);
            }
            if (((bitField0_ & 0x00040000) == 0x00040000)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(20, coveredConditions_);
            }
            size += unknownFields.getSerializedSize();
            memoizedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;
        @java.lang.Override
        public boolean equals(final java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DbFileSources.Line)) {
                return super.equals(obj);
            }
            DbFileSources.Line other = (DbFileSources.Line) obj;

            boolean result = true;
            result = result && (hasLine() == other.hasLine());
            if (hasLine()) {
                result = result && (getLine()
                        == other.getLine());
            }
            result = result && (hasSource() == other.hasSource());
            if (hasSource()) {
                result = result && getSource()
                        .equals(other.getSource());
            }
            result = result && (hasScmRevision() == other.hasScmRevision());
            if (hasScmRevision()) {
                result = result && getScmRevision()
                        .equals(other.getScmRevision());
            }
            result = result && (hasScmAuthor() == other.hasScmAuthor());
            if (hasScmAuthor()) {
                result = result && getScmAuthor()
                        .equals(other.getScmAuthor());
            }
            result = result && (hasScmDate() == other.hasScmDate());
            if (hasScmDate()) {
                result = result && (getScmDate()
                        == other.getScmDate());
            }
            result = result && (hasDeprecatedUtLineHits() == other.hasDeprecatedUtLineHits());
            if (hasDeprecatedUtLineHits()) {
                result = result && (getDeprecatedUtLineHits()
                        == other.getDeprecatedUtLineHits());
            }
            result = result && (hasDeprecatedUtConditions() == other.hasDeprecatedUtConditions());
            if (hasDeprecatedUtConditions()) {
                result = result && (getDeprecatedUtConditions()
                        == other.getDeprecatedUtConditions());
            }
            result = result && (hasDeprecatedUtCoveredConditions() == other.hasDeprecatedUtCoveredConditions());
            if (hasDeprecatedUtCoveredConditions()) {
                result = result && (getDeprecatedUtCoveredConditions()
                        == other.getDeprecatedUtCoveredConditions());
            }
            result = result && (hasDeprecatedItLineHits() == other.hasDeprecatedItLineHits());
            if (hasDeprecatedItLineHits()) {
                result = result && (getDeprecatedItLineHits()
                        == other.getDeprecatedItLineHits());
            }
            result = result && (hasDeprecatedItConditions() == other.hasDeprecatedItConditions());
            if (hasDeprecatedItConditions()) {
                result = result && (getDeprecatedItConditions()
                        == other.getDeprecatedItConditions());
            }
            result = result && (hasDeprecatedItCoveredConditions() == other.hasDeprecatedItCoveredConditions());
            if (hasDeprecatedItCoveredConditions()) {
                result = result && (getDeprecatedItCoveredConditions()
                        == other.getDeprecatedItCoveredConditions());
            }
            result = result && (hasDeprecatedOverallLineHits() == other.hasDeprecatedOverallLineHits());
            if (hasDeprecatedOverallLineHits()) {
                result = result && (getDeprecatedOverallLineHits()
                        == other.getDeprecatedOverallLineHits());
            }
            result = result && (hasDeprecatedOverallConditions() == other.hasDeprecatedOverallConditions());
            if (hasDeprecatedOverallConditions()) {
                result = result && (getDeprecatedOverallConditions()
                        == other.getDeprecatedOverallConditions());
            }
            result = result && (hasDeprecatedOverallCoveredConditions() == other.hasDeprecatedOverallCoveredConditions());
            if (hasDeprecatedOverallCoveredConditions()) {
                result = result && (getDeprecatedOverallCoveredConditions()
                        == other.getDeprecatedOverallCoveredConditions());
            }
            result = result && (hasHighlighting() == other.hasHighlighting());
            if (hasHighlighting()) {
                result = result && getHighlighting()
                        .equals(other.getHighlighting());
            }
            result = result && (hasSymbols() == other.hasSymbols());
            if (hasSymbols()) {
                result = result && getSymbols()
                        .equals(other.getSymbols());
            }
            result = result && getDuplicationList()
                    .equals(other.getDuplicationList());
            result = result && (hasLineHits() == other.hasLineHits());
            if (hasLineHits()) {
                result = result && (getLineHits()
                        == other.getLineHits());
            }
            result = result && (hasConditions() == other.hasConditions());
            if (hasConditions()) {
                result = result && (getConditions()
                        == other.getConditions());
            }
            result = result && (hasCoveredConditions() == other.hasCoveredConditions());
            if (hasCoveredConditions()) {
                result = result && (getCoveredConditions()
                        == other.getCoveredConditions());
            }
            result = result && unknownFields.equals(other.unknownFields);
            return result;
        }

        @java.lang.Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            if (hasLine()) {
                hash = (37 * hash) + LINE_FIELD_NUMBER;
                hash = (53 * hash) + getLine();
            }
            if (hasSource()) {
                hash = (37 * hash) + SOURCE_FIELD_NUMBER;
                hash = (53 * hash) + getSource().hashCode();
            }
            if (hasScmRevision()) {
                hash = (37 * hash) + SCM_REVISION_FIELD_NUMBER;
                hash = (53 * hash) + getScmRevision().hashCode();
            }
            if (hasScmAuthor()) {
                hash = (37 * hash) + SCM_AUTHOR_FIELD_NUMBER;
                hash = (53 * hash) + getScmAuthor().hashCode();
            }
            if (hasScmDate()) {
                hash = (37 * hash) + SCM_DATE_FIELD_NUMBER;
                hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
                        getScmDate());
            }
            if (hasDeprecatedUtLineHits()) {
                hash = (37 * hash) + DEPRECATED_UT_LINE_HITS_FIELD_NUMBER;
                hash = (53 * hash) + getDeprecatedUtLineHits();
            }
            if (hasDeprecatedUtConditions()) {
                hash = (37 * hash) + DEPRECATED_UT_CONDITIONS_FIELD_NUMBER;
                hash = (53 * hash) + getDeprecatedUtConditions();
            }
            if (hasDeprecatedUtCoveredConditions()) {
                hash = (37 * hash) + DEPRECATED_UT_COVERED_CONDITIONS_FIELD_NUMBER;
                hash = (53 * hash) + getDeprecatedUtCoveredConditions();
            }
            if (hasDeprecatedItLineHits()) {
                hash = (37 * hash) + DEPRECATED_IT_LINE_HITS_FIELD_NUMBER;
                hash = (53 * hash) + getDeprecatedItLineHits();
            }
            if (hasDeprecatedItConditions()) {
                hash = (37 * hash) + DEPRECATED_IT_CONDITIONS_FIELD_NUMBER;
                hash = (53 * hash) + getDeprecatedItConditions();
            }
            if (hasDeprecatedItCoveredConditions()) {
                hash = (37 * hash) + DEPRECATED_IT_COVERED_CONDITIONS_FIELD_NUMBER;
                hash = (53 * hash) + getDeprecatedItCoveredConditions();
            }
            if (hasDeprecatedOverallLineHits()) {
                hash = (37 * hash) + DEPRECATED_OVERALL_LINE_HITS_FIELD_NUMBER;
                hash = (53 * hash) + getDeprecatedOverallLineHits();
            }
            if (hasDeprecatedOverallConditions()) {
                hash = (37 * hash) + DEPRECATED_OVERALL_CONDITIONS_FIELD_NUMBER;
                hash = (53 * hash) + getDeprecatedOverallConditions();
            }
            if (hasDeprecatedOverallCoveredConditions()) {
                hash = (37 * hash) + DEPRECATED_OVERALL_COVERED_CONDITIONS_FIELD_NUMBER;
                hash = (53 * hash) + getDeprecatedOverallCoveredConditions();
            }
            if (hasHighlighting()) {
                hash = (37 * hash) + HIGHLIGHTING_FIELD_NUMBER;
                hash = (53 * hash) + getHighlighting().hashCode();
            }
            if (hasSymbols()) {
                hash = (37 * hash) + SYMBOLS_FIELD_NUMBER;
                hash = (53 * hash) + getSymbols().hashCode();
            }
            if (getDuplicationCount() > 0) {
                hash = (37 * hash) + DUPLICATION_FIELD_NUMBER;
                hash = (53 * hash) + getDuplicationList().hashCode();
            }
            if (hasLineHits()) {
                hash = (37 * hash) + LINE_HITS_FIELD_NUMBER;
                hash = (53 * hash) + getLineHits();
            }
            if (hasConditions()) {
                hash = (37 * hash) + CONDITIONS_FIELD_NUMBER;
                hash = (53 * hash) + getConditions();
            }
            if (hasCoveredConditions()) {
                hash = (37 * hash) + COVERED_CONDITIONS_FIELD_NUMBER;
                hash = (53 * hash) + getCoveredConditions();
            }
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static DbFileSources.Line parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static DbFileSources.Line parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static DbFileSources.Line parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static DbFileSources.Line parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static DbFileSources.Line parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static DbFileSources.Line parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }
        public static DbFileSources.Line parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }
        public static DbFileSources.Line parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }
        public static DbFileSources.Line parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static DbFileSources.Line parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }
        public static Builder newBuilder(DbFileSources.Line prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE
                    ? new Builder() : new Builder().mergeFrom(this);
        }

        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         * Protobuf type {@code com.linio.sonarqube.source.db.Line}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:com.linio.sonarqube.source.db.Line)
                DbFileSources.LineOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return DbFileSources.internal_static_com_linio_sonarqube_source_db_Line_descriptor;
            }

            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return DbFileSources.internal_static_com_linio_sonarqube_source_db_Line_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                DbFileSources.Line.class, DbFileSources.Line.Builder.class);
            }

            // Construct using com.linio.sonarqube.protobuf.DbFileSources.Line.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }
            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3
                        .alwaysUseFieldBuilders) {
                }
            }
            public Builder clear() {
                super.clear();
                line_ = 0;
                bitField0_ = (bitField0_ & ~0x00000001);
                source_ = "";
                bitField0_ = (bitField0_ & ~0x00000002);
                scmRevision_ = "";
                bitField0_ = (bitField0_ & ~0x00000004);
                scmAuthor_ = "";
                bitField0_ = (bitField0_ & ~0x00000008);
                scmDate_ = 0L;
                bitField0_ = (bitField0_ & ~0x00000010);
                deprecatedUtLineHits_ = 0;
                bitField0_ = (bitField0_ & ~0x00000020);
                deprecatedUtConditions_ = 0;
                bitField0_ = (bitField0_ & ~0x00000040);
                deprecatedUtCoveredConditions_ = 0;
                bitField0_ = (bitField0_ & ~0x00000080);
                deprecatedItLineHits_ = 0;
                bitField0_ = (bitField0_ & ~0x00000100);
                deprecatedItConditions_ = 0;
                bitField0_ = (bitField0_ & ~0x00000200);
                deprecatedItCoveredConditions_ = 0;
                bitField0_ = (bitField0_ & ~0x00000400);
                deprecatedOverallLineHits_ = 0;
                bitField0_ = (bitField0_ & ~0x00000800);
                deprecatedOverallConditions_ = 0;
                bitField0_ = (bitField0_ & ~0x00001000);
                deprecatedOverallCoveredConditions_ = 0;
                bitField0_ = (bitField0_ & ~0x00002000);
                highlighting_ = "";
                bitField0_ = (bitField0_ & ~0x00004000);
                symbols_ = "";
                bitField0_ = (bitField0_ & ~0x00008000);
                duplication_ = java.util.Collections.emptyList();
                bitField0_ = (bitField0_ & ~0x00010000);
                lineHits_ = 0;
                bitField0_ = (bitField0_ & ~0x00020000);
                conditions_ = 0;
                bitField0_ = (bitField0_ & ~0x00040000);
                coveredConditions_ = 0;
                bitField0_ = (bitField0_ & ~0x00080000);
                return this;
            }

            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return DbFileSources.internal_static_com_linio_sonarqube_source_db_Line_descriptor;
            }

            public DbFileSources.Line getDefaultInstanceForType() {
                return DbFileSources.Line.getDefaultInstance();
            }

            public DbFileSources.Line build() {
                DbFileSources.Line result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public DbFileSources.Line buildPartial() {
                DbFileSources.Line result = new DbFileSources.Line(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                    to_bitField0_ |= 0x00000001;
                }
                result.line_ = line_;
                if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                    to_bitField0_ |= 0x00000002;
                }
                result.source_ = source_;
                if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
                    to_bitField0_ |= 0x00000004;
                }
                result.scmRevision_ = scmRevision_;
                if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
                    to_bitField0_ |= 0x00000008;
                }
                result.scmAuthor_ = scmAuthor_;
                if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
                    to_bitField0_ |= 0x00000010;
                }
                result.scmDate_ = scmDate_;
                if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
                    to_bitField0_ |= 0x00000020;
                }
                result.deprecatedUtLineHits_ = deprecatedUtLineHits_;
                if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
                    to_bitField0_ |= 0x00000040;
                }
                result.deprecatedUtConditions_ = deprecatedUtConditions_;
                if (((from_bitField0_ & 0x00000080) == 0x00000080)) {
                    to_bitField0_ |= 0x00000080;
                }
                result.deprecatedUtCoveredConditions_ = deprecatedUtCoveredConditions_;
                if (((from_bitField0_ & 0x00000100) == 0x00000100)) {
                    to_bitField0_ |= 0x00000100;
                }
                result.deprecatedItLineHits_ = deprecatedItLineHits_;
                if (((from_bitField0_ & 0x00000200) == 0x00000200)) {
                    to_bitField0_ |= 0x00000200;
                }
                result.deprecatedItConditions_ = deprecatedItConditions_;
                if (((from_bitField0_ & 0x00000400) == 0x00000400)) {
                    to_bitField0_ |= 0x00000400;
                }
                result.deprecatedItCoveredConditions_ = deprecatedItCoveredConditions_;
                if (((from_bitField0_ & 0x00000800) == 0x00000800)) {
                    to_bitField0_ |= 0x00000800;
                }
                result.deprecatedOverallLineHits_ = deprecatedOverallLineHits_;
                if (((from_bitField0_ & 0x00001000) == 0x00001000)) {
                    to_bitField0_ |= 0x00001000;
                }
                result.deprecatedOverallConditions_ = deprecatedOverallConditions_;
                if (((from_bitField0_ & 0x00002000) == 0x00002000)) {
                    to_bitField0_ |= 0x00002000;
                }
                result.deprecatedOverallCoveredConditions_ = deprecatedOverallCoveredConditions_;
                if (((from_bitField0_ & 0x00004000) == 0x00004000)) {
                    to_bitField0_ |= 0x00004000;
                }
                result.highlighting_ = highlighting_;
                if (((from_bitField0_ & 0x00008000) == 0x00008000)) {
                    to_bitField0_ |= 0x00008000;
                }
                result.symbols_ = symbols_;
                if (((bitField0_ & 0x00010000) == 0x00010000)) {
                    duplication_ = java.util.Collections.unmodifiableList(duplication_);
                    bitField0_ = (bitField0_ & ~0x00010000);
                }
                result.duplication_ = duplication_;
                if (((from_bitField0_ & 0x00020000) == 0x00020000)) {
                    to_bitField0_ |= 0x00010000;
                }
                result.lineHits_ = lineHits_;
                if (((from_bitField0_ & 0x00040000) == 0x00040000)) {
                    to_bitField0_ |= 0x00020000;
                }
                result.conditions_ = conditions_;
                if (((from_bitField0_ & 0x00080000) == 0x00080000)) {
                    to_bitField0_ |= 0x00040000;
                }
                result.coveredConditions_ = coveredConditions_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return (Builder) super.setField(field, value);
            }
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return (Builder) super.clearField(field);
            }
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return (Builder) super.clearOneof(oneof);
            }
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, Object value) {
                return (Builder) super.setRepeatedField(field, index, value);
            }
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return (Builder) super.addRepeatedField(field, value);
            }
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof DbFileSources.Line) {
                    return mergeFrom((DbFileSources.Line)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(DbFileSources.Line other) {
                if (other == DbFileSources.Line.getDefaultInstance()) return this;
                if (other.hasLine()) {
                    setLine(other.getLine());
                }
                if (other.hasSource()) {
                    bitField0_ |= 0x00000002;
                    source_ = other.source_;
                    onChanged();
                }
                if (other.hasScmRevision()) {
                    bitField0_ |= 0x00000004;
                    scmRevision_ = other.scmRevision_;
                    onChanged();
                }
                if (other.hasScmAuthor()) {
                    bitField0_ |= 0x00000008;
                    scmAuthor_ = other.scmAuthor_;
                    onChanged();
                }
                if (other.hasScmDate()) {
                    setScmDate(other.getScmDate());
                }
                if (other.hasDeprecatedUtLineHits()) {
                    setDeprecatedUtLineHits(other.getDeprecatedUtLineHits());
                }
                if (other.hasDeprecatedUtConditions()) {
                    setDeprecatedUtConditions(other.getDeprecatedUtConditions());
                }
                if (other.hasDeprecatedUtCoveredConditions()) {
                    setDeprecatedUtCoveredConditions(other.getDeprecatedUtCoveredConditions());
                }
                if (other.hasDeprecatedItLineHits()) {
                    setDeprecatedItLineHits(other.getDeprecatedItLineHits());
                }
                if (other.hasDeprecatedItConditions()) {
                    setDeprecatedItConditions(other.getDeprecatedItConditions());
                }
                if (other.hasDeprecatedItCoveredConditions()) {
                    setDeprecatedItCoveredConditions(other.getDeprecatedItCoveredConditions());
                }
                if (other.hasDeprecatedOverallLineHits()) {
                    setDeprecatedOverallLineHits(other.getDeprecatedOverallLineHits());
                }
                if (other.hasDeprecatedOverallConditions()) {
                    setDeprecatedOverallConditions(other.getDeprecatedOverallConditions());
                }
                if (other.hasDeprecatedOverallCoveredConditions()) {
                    setDeprecatedOverallCoveredConditions(other.getDeprecatedOverallCoveredConditions());
                }
                if (other.hasHighlighting()) {
                    bitField0_ |= 0x00004000;
                    highlighting_ = other.highlighting_;
                    onChanged();
                }
                if (other.hasSymbols()) {
                    bitField0_ |= 0x00008000;
                    symbols_ = other.symbols_;
                    onChanged();
                }
                if (!other.duplication_.isEmpty()) {
                    if (duplication_.isEmpty()) {
                        duplication_ = other.duplication_;
                        bitField0_ = (bitField0_ & ~0x00010000);
                    } else {
                        ensureDuplicationIsMutable();
                        duplication_.addAll(other.duplication_);
                    }
                    onChanged();
                }
                if (other.hasLineHits()) {
                    setLineHits(other.getLineHits());
                }
                if (other.hasConditions()) {
                    setConditions(other.getConditions());
                }
                if (other.hasCoveredConditions()) {
                    setCoveredConditions(other.getCoveredConditions());
                }
                this.mergeUnknownFields(other.unknownFields);
                onChanged();
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                DbFileSources.Line parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (DbFileSources.Line) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            private int bitField0_;

            private int line_ ;
            /**
             * <code>optional int32 line = 1;</code>
             */
            public boolean hasLine() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }
            /**
             * <code>optional int32 line = 1;</code>
             */
            public int getLine() {
                return line_;
            }
            /**
             * <code>optional int32 line = 1;</code>
             */
            public Builder setLine(int value) {
                bitField0_ |= 0x00000001;
                line_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional int32 line = 1;</code>
             */
            public Builder clearLine() {
                bitField0_ = (bitField0_ & ~0x00000001);
                line_ = 0;
                onChanged();
                return this;
            }

            private java.lang.Object source_ = "";
            /**
             * <code>optional string source = 2;</code>
             */
            public boolean hasSource() {
                return ((bitField0_ & 0x00000002) == 0x00000002);
            }
            /**
             * <code>optional string source = 2;</code>
             */
            public java.lang.String getSource() {
                java.lang.Object ref = source_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) {
                        source_ = s;
                    }
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }
            /**
             * <code>optional string source = 2;</code>
             */
            public com.google.protobuf.ByteString
            getSourceBytes() {
                java.lang.Object ref = source_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    source_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>optional string source = 2;</code>
             */
            public Builder setSource(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000002;
                source_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional string source = 2;</code>
             */
            public Builder clearSource() {
                bitField0_ = (bitField0_ & ~0x00000002);
                source_ = getDefaultInstance().getSource();
                onChanged();
                return this;
            }
            /**
             * <code>optional string source = 2;</code>
             */
            public Builder setSourceBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000002;
                source_ = value;
                onChanged();
                return this;
            }

            private java.lang.Object scmRevision_ = "";
            /**
             * <pre>
             * SCM
             * </pre>
             *
             * <code>optional string scm_revision = 3;</code>
             */
            public boolean hasScmRevision() {
                return ((bitField0_ & 0x00000004) == 0x00000004);
            }
            /**
             * <pre>
             * SCM
             * </pre>
             *
             * <code>optional string scm_revision = 3;</code>
             */
            public java.lang.String getScmRevision() {
                java.lang.Object ref = scmRevision_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) {
                        scmRevision_ = s;
                    }
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }
            /**
             * <pre>
             * SCM
             * </pre>
             *
             * <code>optional string scm_revision = 3;</code>
             */
            public com.google.protobuf.ByteString
            getScmRevisionBytes() {
                java.lang.Object ref = scmRevision_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    scmRevision_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <pre>
             * SCM
             * </pre>
             *
             * <code>optional string scm_revision = 3;</code>
             */
            public Builder setScmRevision(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000004;
                scmRevision_ = value;
                onChanged();
                return this;
            }
            /**
             * <pre>
             * SCM
             * </pre>
             *
             * <code>optional string scm_revision = 3;</code>
             */
            public Builder clearScmRevision() {
                bitField0_ = (bitField0_ & ~0x00000004);
                scmRevision_ = getDefaultInstance().getScmRevision();
                onChanged();
                return this;
            }
            /**
             * <pre>
             * SCM
             * </pre>
             *
             * <code>optional string scm_revision = 3;</code>
             */
            public Builder setScmRevisionBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000004;
                scmRevision_ = value;
                onChanged();
                return this;
            }

            private java.lang.Object scmAuthor_ = "";
            /**
             * <code>optional string scm_author = 4;</code>
             */
            public boolean hasScmAuthor() {
                return ((bitField0_ & 0x00000008) == 0x00000008);
            }
            /**
             * <code>optional string scm_author = 4;</code>
             */
            public java.lang.String getScmAuthor() {
                java.lang.Object ref = scmAuthor_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) {
                        scmAuthor_ = s;
                    }
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }
            /**
             * <code>optional string scm_author = 4;</code>
             */
            public com.google.protobuf.ByteString
            getScmAuthorBytes() {
                java.lang.Object ref = scmAuthor_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    scmAuthor_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>optional string scm_author = 4;</code>
             */
            public Builder setScmAuthor(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000008;
                scmAuthor_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional string scm_author = 4;</code>
             */
            public Builder clearScmAuthor() {
                bitField0_ = (bitField0_ & ~0x00000008);
                scmAuthor_ = getDefaultInstance().getScmAuthor();
                onChanged();
                return this;
            }
            /**
             * <code>optional string scm_author = 4;</code>
             */
            public Builder setScmAuthorBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000008;
                scmAuthor_ = value;
                onChanged();
                return this;
            }

            private long scmDate_ ;
            /**
             * <code>optional int64 scm_date = 5;</code>
             */
            public boolean hasScmDate() {
                return ((bitField0_ & 0x00000010) == 0x00000010);
            }
            /**
             * <code>optional int64 scm_date = 5;</code>
             */
            public long getScmDate() {
                return scmDate_;
            }
            /**
             * <code>optional int64 scm_date = 5;</code>
             */
            public Builder setScmDate(long value) {
                bitField0_ |= 0x00000010;
                scmDate_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional int64 scm_date = 5;</code>
             */
            public Builder clearScmDate() {
                bitField0_ = (bitField0_ & ~0x00000010);
                scmDate_ = 0L;
                onChanged();
                return this;
            }

            private int deprecatedUtLineHits_ ;
            /**
             * <pre>
             * Deprecated fields in 6.2 (has been deprecated when merging coverage into a single metric)
             * They are still used to read coverage info from sources that have not be re-analyzed
             * </pre>
             *
             * <code>optional int32 deprecated_ut_line_hits = 6;</code>
             */
            public boolean hasDeprecatedUtLineHits() {
                return ((bitField0_ & 0x00000020) == 0x00000020);
            }
            /**
             * <pre>
             * Deprecated fields in 6.2 (has been deprecated when merging coverage into a single metric)
             * They are still used to read coverage info from sources that have not be re-analyzed
             * </pre>
             *
             * <code>optional int32 deprecated_ut_line_hits = 6;</code>
             */
            public int getDeprecatedUtLineHits() {
                return deprecatedUtLineHits_;
            }
            /**
             * <pre>
             * Deprecated fields in 6.2 (has been deprecated when merging coverage into a single metric)
             * They are still used to read coverage info from sources that have not be re-analyzed
             * </pre>
             *
             * <code>optional int32 deprecated_ut_line_hits = 6;</code>
             */
            public Builder setDeprecatedUtLineHits(int value) {
                bitField0_ |= 0x00000020;
                deprecatedUtLineHits_ = value;
                onChanged();
                return this;
            }
            /**
             * <pre>
             * Deprecated fields in 6.2 (has been deprecated when merging coverage into a single metric)
             * They are still used to read coverage info from sources that have not be re-analyzed
             * </pre>
             *
             * <code>optional int32 deprecated_ut_line_hits = 6;</code>
             */
            public Builder clearDeprecatedUtLineHits() {
                bitField0_ = (bitField0_ & ~0x00000020);
                deprecatedUtLineHits_ = 0;
                onChanged();
                return this;
            }

            private int deprecatedUtConditions_ ;
            /**
             * <code>optional int32 deprecated_ut_conditions = 7;</code>
             */
            public boolean hasDeprecatedUtConditions() {
                return ((bitField0_ & 0x00000040) == 0x00000040);
            }
            /**
             * <code>optional int32 deprecated_ut_conditions = 7;</code>
             */
            public int getDeprecatedUtConditions() {
                return deprecatedUtConditions_;
            }
            /**
             * <code>optional int32 deprecated_ut_conditions = 7;</code>
             */
            public Builder setDeprecatedUtConditions(int value) {
                bitField0_ |= 0x00000040;
                deprecatedUtConditions_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional int32 deprecated_ut_conditions = 7;</code>
             */
            public Builder clearDeprecatedUtConditions() {
                bitField0_ = (bitField0_ & ~0x00000040);
                deprecatedUtConditions_ = 0;
                onChanged();
                return this;
            }

            private int deprecatedUtCoveredConditions_ ;
            /**
             * <code>optional int32 deprecated_ut_covered_conditions = 8;</code>
             */
            public boolean hasDeprecatedUtCoveredConditions() {
                return ((bitField0_ & 0x00000080) == 0x00000080);
            }
            /**
             * <code>optional int32 deprecated_ut_covered_conditions = 8;</code>
             */
            public int getDeprecatedUtCoveredConditions() {
                return deprecatedUtCoveredConditions_;
            }
            /**
             * <code>optional int32 deprecated_ut_covered_conditions = 8;</code>
             */
            public Builder setDeprecatedUtCoveredConditions(int value) {
                bitField0_ |= 0x00000080;
                deprecatedUtCoveredConditions_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional int32 deprecated_ut_covered_conditions = 8;</code>
             */
            public Builder clearDeprecatedUtCoveredConditions() {
                bitField0_ = (bitField0_ & ~0x00000080);
                deprecatedUtCoveredConditions_ = 0;
                onChanged();
                return this;
            }

            private int deprecatedItLineHits_ ;
            /**
             * <code>optional int32 deprecated_it_line_hits = 9;</code>
             */
            public boolean hasDeprecatedItLineHits() {
                return ((bitField0_ & 0x00000100) == 0x00000100);
            }
            /**
             * <code>optional int32 deprecated_it_line_hits = 9;</code>
             */
            public int getDeprecatedItLineHits() {
                return deprecatedItLineHits_;
            }
            /**
             * <code>optional int32 deprecated_it_line_hits = 9;</code>
             */
            public Builder setDeprecatedItLineHits(int value) {
                bitField0_ |= 0x00000100;
                deprecatedItLineHits_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional int32 deprecated_it_line_hits = 9;</code>
             */
            public Builder clearDeprecatedItLineHits() {
                bitField0_ = (bitField0_ & ~0x00000100);
                deprecatedItLineHits_ = 0;
                onChanged();
                return this;
            }

            private int deprecatedItConditions_ ;
            /**
             * <code>optional int32 deprecated_it_conditions = 10;</code>
             */
            public boolean hasDeprecatedItConditions() {
                return ((bitField0_ & 0x00000200) == 0x00000200);
            }
            /**
             * <code>optional int32 deprecated_it_conditions = 10;</code>
             */
            public int getDeprecatedItConditions() {
                return deprecatedItConditions_;
            }
            /**
             * <code>optional int32 deprecated_it_conditions = 10;</code>
             */
            public Builder setDeprecatedItConditions(int value) {
                bitField0_ |= 0x00000200;
                deprecatedItConditions_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional int32 deprecated_it_conditions = 10;</code>
             */
            public Builder clearDeprecatedItConditions() {
                bitField0_ = (bitField0_ & ~0x00000200);
                deprecatedItConditions_ = 0;
                onChanged();
                return this;
            }

            private int deprecatedItCoveredConditions_ ;
            /**
             * <code>optional int32 deprecated_it_covered_conditions = 11;</code>
             */
            public boolean hasDeprecatedItCoveredConditions() {
                return ((bitField0_ & 0x00000400) == 0x00000400);
            }
            /**
             * <code>optional int32 deprecated_it_covered_conditions = 11;</code>
             */
            public int getDeprecatedItCoveredConditions() {
                return deprecatedItCoveredConditions_;
            }
            /**
             * <code>optional int32 deprecated_it_covered_conditions = 11;</code>
             */
            public Builder setDeprecatedItCoveredConditions(int value) {
                bitField0_ |= 0x00000400;
                deprecatedItCoveredConditions_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional int32 deprecated_it_covered_conditions = 11;</code>
             */
            public Builder clearDeprecatedItCoveredConditions() {
                bitField0_ = (bitField0_ & ~0x00000400);
                deprecatedItCoveredConditions_ = 0;
                onChanged();
                return this;
            }

            private int deprecatedOverallLineHits_ ;
            /**
             * <code>optional int32 deprecated_overall_line_hits = 12;</code>
             */
            public boolean hasDeprecatedOverallLineHits() {
                return ((bitField0_ & 0x00000800) == 0x00000800);
            }
            /**
             * <code>optional int32 deprecated_overall_line_hits = 12;</code>
             */
            public int getDeprecatedOverallLineHits() {
                return deprecatedOverallLineHits_;
            }
            /**
             * <code>optional int32 deprecated_overall_line_hits = 12;</code>
             */
            public Builder setDeprecatedOverallLineHits(int value) {
                bitField0_ |= 0x00000800;
                deprecatedOverallLineHits_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional int32 deprecated_overall_line_hits = 12;</code>
             */
            public Builder clearDeprecatedOverallLineHits() {
                bitField0_ = (bitField0_ & ~0x00000800);
                deprecatedOverallLineHits_ = 0;
                onChanged();
                return this;
            }

            private int deprecatedOverallConditions_ ;
            /**
             * <code>optional int32 deprecated_overall_conditions = 13;</code>
             */
            public boolean hasDeprecatedOverallConditions() {
                return ((bitField0_ & 0x00001000) == 0x00001000);
            }
            /**
             * <code>optional int32 deprecated_overall_conditions = 13;</code>
             */
            public int getDeprecatedOverallConditions() {
                return deprecatedOverallConditions_;
            }
            /**
             * <code>optional int32 deprecated_overall_conditions = 13;</code>
             */
            public Builder setDeprecatedOverallConditions(int value) {
                bitField0_ |= 0x00001000;
                deprecatedOverallConditions_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional int32 deprecated_overall_conditions = 13;</code>
             */
            public Builder clearDeprecatedOverallConditions() {
                bitField0_ = (bitField0_ & ~0x00001000);
                deprecatedOverallConditions_ = 0;
                onChanged();
                return this;
            }

            private int deprecatedOverallCoveredConditions_ ;
            /**
             * <code>optional int32 deprecated_overall_covered_conditions = 14;</code>
             */
            public boolean hasDeprecatedOverallCoveredConditions() {
                return ((bitField0_ & 0x00002000) == 0x00002000);
            }
            /**
             * <code>optional int32 deprecated_overall_covered_conditions = 14;</code>
             */
            public int getDeprecatedOverallCoveredConditions() {
                return deprecatedOverallCoveredConditions_;
            }
            /**
             * <code>optional int32 deprecated_overall_covered_conditions = 14;</code>
             */
            public Builder setDeprecatedOverallCoveredConditions(int value) {
                bitField0_ |= 0x00002000;
                deprecatedOverallCoveredConditions_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional int32 deprecated_overall_covered_conditions = 14;</code>
             */
            public Builder clearDeprecatedOverallCoveredConditions() {
                bitField0_ = (bitField0_ & ~0x00002000);
                deprecatedOverallCoveredConditions_ = 0;
                onChanged();
                return this;
            }

            private java.lang.Object highlighting_ = "";
            /**
             * <code>optional string highlighting = 15;</code>
             */
            public boolean hasHighlighting() {
                return ((bitField0_ & 0x00004000) == 0x00004000);
            }
            /**
             * <code>optional string highlighting = 15;</code>
             */
            public java.lang.String getHighlighting() {
                java.lang.Object ref = highlighting_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) {
                        highlighting_ = s;
                    }
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }
            /**
             * <code>optional string highlighting = 15;</code>
             */
            public com.google.protobuf.ByteString
            getHighlightingBytes() {
                java.lang.Object ref = highlighting_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    highlighting_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>optional string highlighting = 15;</code>
             */
            public Builder setHighlighting(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00004000;
                highlighting_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional string highlighting = 15;</code>
             */
            public Builder clearHighlighting() {
                bitField0_ = (bitField0_ & ~0x00004000);
                highlighting_ = getDefaultInstance().getHighlighting();
                onChanged();
                return this;
            }
            /**
             * <code>optional string highlighting = 15;</code>
             */
            public Builder setHighlightingBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00004000;
                highlighting_ = value;
                onChanged();
                return this;
            }

            private java.lang.Object symbols_ = "";
            /**
             * <code>optional string symbols = 16;</code>
             */
            public boolean hasSymbols() {
                return ((bitField0_ & 0x00008000) == 0x00008000);
            }
            /**
             * <code>optional string symbols = 16;</code>
             */
            public java.lang.String getSymbols() {
                java.lang.Object ref = symbols_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) {
                        symbols_ = s;
                    }
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }
            /**
             * <code>optional string symbols = 16;</code>
             */
            public com.google.protobuf.ByteString
            getSymbolsBytes() {
                java.lang.Object ref = symbols_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    symbols_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>optional string symbols = 16;</code>
             */
            public Builder setSymbols(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00008000;
                symbols_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional string symbols = 16;</code>
             */
            public Builder clearSymbols() {
                bitField0_ = (bitField0_ & ~0x00008000);
                symbols_ = getDefaultInstance().getSymbols();
                onChanged();
                return this;
            }
            /**
             * <code>optional string symbols = 16;</code>
             */
            public Builder setSymbolsBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00008000;
                symbols_ = value;
                onChanged();
                return this;
            }

            private java.util.List<java.lang.Integer> duplication_ = java.util.Collections.emptyList();
            private void ensureDuplicationIsMutable() {
                if (!((bitField0_ & 0x00010000) == 0x00010000)) {
                    duplication_ = new java.util.ArrayList<java.lang.Integer>(duplication_);
                    bitField0_ |= 0x00010000;
                }
            }
            /**
             * <code>repeated int32 duplication = 17 [packed = true];</code>
             */
            public java.util.List<java.lang.Integer>
            getDuplicationList() {
                return java.util.Collections.unmodifiableList(duplication_);
            }
            /**
             * <code>repeated int32 duplication = 17 [packed = true];</code>
             */
            public int getDuplicationCount() {
                return duplication_.size();
            }
            /**
             * <code>repeated int32 duplication = 17 [packed = true];</code>
             */
            public int getDuplication(int index) {
                return duplication_.get(index);
            }
            /**
             * <code>repeated int32 duplication = 17 [packed = true];</code>
             */
            public Builder setDuplication(
                    int index, int value) {
                ensureDuplicationIsMutable();
                duplication_.set(index, value);
                onChanged();
                return this;
            }
            /**
             * <code>repeated int32 duplication = 17 [packed = true];</code>
             */
            public Builder addDuplication(int value) {
                ensureDuplicationIsMutable();
                duplication_.add(value);
                onChanged();
                return this;
            }
            /**
             * <code>repeated int32 duplication = 17 [packed = true];</code>
             */
            public Builder addAllDuplication(
                    java.lang.Iterable<? extends java.lang.Integer> values) {
                ensureDuplicationIsMutable();
                com.google.protobuf.AbstractMessageLite.Builder.addAll(
                        values, duplication_);
                onChanged();
                return this;
            }
            /**
             * <code>repeated int32 duplication = 17 [packed = true];</code>
             */
            public Builder clearDuplication() {
                duplication_ = java.util.Collections.emptyList();
                bitField0_ = (bitField0_ & ~0x00010000);
                onChanged();
                return this;
            }

            private int lineHits_ ;
            /**
             * <pre>
             * coverage info (since 6.2)
             * </pre>
             *
             * <code>optional int32 line_hits = 18;</code>
             */
            public boolean hasLineHits() {
                return ((bitField0_ & 0x00020000) == 0x00020000);
            }
            /**
             * <pre>
             * coverage info (since 6.2)
             * </pre>
             *
             * <code>optional int32 line_hits = 18;</code>
             */
            public int getLineHits() {
                return lineHits_;
            }
            /**
             * <pre>
             * coverage info (since 6.2)
             * </pre>
             *
             * <code>optional int32 line_hits = 18;</code>
             */
            public Builder setLineHits(int value) {
                bitField0_ |= 0x00020000;
                lineHits_ = value;
                onChanged();
                return this;
            }
            /**
             * <pre>
             * coverage info (since 6.2)
             * </pre>
             *
             * <code>optional int32 line_hits = 18;</code>
             */
            public Builder clearLineHits() {
                bitField0_ = (bitField0_ & ~0x00020000);
                lineHits_ = 0;
                onChanged();
                return this;
            }

            private int conditions_ ;
            /**
             * <code>optional int32 conditions = 19;</code>
             */
            public boolean hasConditions() {
                return ((bitField0_ & 0x00040000) == 0x00040000);
            }
            /**
             * <code>optional int32 conditions = 19;</code>
             */
            public int getConditions() {
                return conditions_;
            }
            /**
             * <code>optional int32 conditions = 19;</code>
             */
            public Builder setConditions(int value) {
                bitField0_ |= 0x00040000;
                conditions_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional int32 conditions = 19;</code>
             */
            public Builder clearConditions() {
                bitField0_ = (bitField0_ & ~0x00040000);
                conditions_ = 0;
                onChanged();
                return this;
            }

            private int coveredConditions_ ;
            /**
             * <code>optional int32 covered_conditions = 20;</code>
             */
            public boolean hasCoveredConditions() {
                return ((bitField0_ & 0x00080000) == 0x00080000);
            }
            /**
             * <code>optional int32 covered_conditions = 20;</code>
             */
            public int getCoveredConditions() {
                return coveredConditions_;
            }
            /**
             * <code>optional int32 covered_conditions = 20;</code>
             */
            public Builder setCoveredConditions(int value) {
                bitField0_ |= 0x00080000;
                coveredConditions_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional int32 covered_conditions = 20;</code>
             */
            public Builder clearCoveredConditions() {
                bitField0_ = (bitField0_ & ~0x00080000);
                coveredConditions_ = 0;
                onChanged();
                return this;
            }
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }

            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }


            // @@protoc_insertion_point(builder_scope:com.linio.sonarqube.source.db.Line)
        }

        // @@protoc_insertion_point(class_scope:com.linio.sonarqube.source.db.Line)
        private static final DbFileSources.Line DEFAULT_INSTANCE;
        static {
            DEFAULT_INSTANCE = new DbFileSources.Line();
        }

        public static DbFileSources.Line getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        @java.lang.Deprecated public static final com.google.protobuf.Parser<Line>
                PARSER = new com.google.protobuf.AbstractParser<Line>() {
            public Line parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new Line(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<Line> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<Line> getParserForType() {
            return PARSER;
        }

        public DbFileSources.Line getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    public interface DataOrBuilder extends
            // @@protoc_insertion_point(interface_extends:com.linio.sonarqube.source.db.Data)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>repeated .com.linio.sonarqube.source.db.Line lines = 1;</code>
         */
        java.util.List<DbFileSources.Line>
        getLinesList();
        /**
         * <code>repeated .com.linio.sonarqube.source.db.Line lines = 1;</code>
         */
        DbFileSources.Line getLines(int index);
        /**
         * <code>repeated .com.linio.sonarqube.source.db.Line lines = 1;</code>
         */
        int getLinesCount();
        /**
         * <code>repeated .com.linio.sonarqube.source.db.Line lines = 1;</code>
         */
        java.util.List<? extends DbFileSources.LineOrBuilder>
        getLinesOrBuilderList();
        /**
         * <code>repeated .com.linio.sonarqube.source.db.Line lines = 1;</code>
         */
        DbFileSources.LineOrBuilder getLinesOrBuilder(
                int index);
    }
    /**
     * <pre>
     * TODO should be dropped as it prevents streaming
     * </pre>
     *
     * Protobuf type {@code com.linio.sonarqube.source.db.Data}
     */
    public  static final class Data extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:com.linio.sonarqube.source.db.Data)
            DataOrBuilder {
        // Use Data.newBuilder() to construct.
        private Data(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }
        private Data() {
            lines_ = java.util.Collections.emptyList();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }
        private Data(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            int mutable_bitField0_ = 0;
            com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                    com.google.protobuf.UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        default: {
                            if (!parseUnknownField(input, unknownFields,
                                    extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                        case 10: {
                            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                                lines_ = new java.util.ArrayList<DbFileSources.Line>();
                                mutable_bitField0_ |= 0x00000001;
                            }
                            lines_.add(
                                    input.readMessage(DbFileSources.Line.PARSER, extensionRegistry));
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e).setUnfinishedMessage(this);
            } finally {
                if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                    lines_ = java.util.Collections.unmodifiableList(lines_);
                }
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return DbFileSources.internal_static_com_linio_sonarqube_source_db_Data_descriptor;
        }

        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return DbFileSources.internal_static_com_linio_sonarqube_source_db_Data_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            DbFileSources.Data.class, DbFileSources.Data.Builder.class);
        }

        public static final int LINES_FIELD_NUMBER = 1;
        private java.util.List<DbFileSources.Line> lines_;
        /**
         * <code>repeated .com.linio.sonarqube.source.db.Line lines = 1;</code>
         */
        public java.util.List<DbFileSources.Line> getLinesList() {
            return lines_;
        }
        /**
         * <code>repeated .com.linio.sonarqube.source.db.Line lines = 1;</code>
         */
        public java.util.List<? extends DbFileSources.LineOrBuilder>
        getLinesOrBuilderList() {
            return lines_;
        }
        /**
         * <code>repeated .com.linio.sonarqube.source.db.Line lines = 1;</code>
         */
        public int getLinesCount() {
            return lines_.size();
        }
        /**
         * <code>repeated .com.linio.sonarqube.source.db.Line lines = 1;</code>
         */
        public DbFileSources.Line getLines(int index) {
            return lines_.get(index);
        }
        /**
         * <code>repeated .com.linio.sonarqube.source.db.Line lines = 1;</code>
         */
        public DbFileSources.LineOrBuilder getLinesOrBuilder(
                int index) {
            return lines_.get(index);
        }

        private byte memoizedIsInitialized = -1;
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            for (int i = 0; i < lines_.size(); i++) {
                output.writeMessage(1, lines_.get(i));
            }
            unknownFields.writeTo(output);
        }

        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            for (int i = 0; i < lines_.size(); i++) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(1, lines_.get(i));
            }
            size += unknownFields.getSerializedSize();
            memoizedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;
        @java.lang.Override
        public boolean equals(final java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DbFileSources.Data)) {
                return super.equals(obj);
            }
            DbFileSources.Data other = (DbFileSources.Data) obj;

            boolean result = true;
            result = result && getLinesList()
                    .equals(other.getLinesList());
            result = result && unknownFields.equals(other.unknownFields);
            return result;
        }

        @java.lang.Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            if (getLinesCount() > 0) {
                hash = (37 * hash) + LINES_FIELD_NUMBER;
                hash = (53 * hash) + getLinesList().hashCode();
            }
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static DbFileSources.Data parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static DbFileSources.Data parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static DbFileSources.Data parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static DbFileSources.Data parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static DbFileSources.Data parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static DbFileSources.Data parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }
        public static DbFileSources.Data parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }
        public static DbFileSources.Data parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }
        public static DbFileSources.Data parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static DbFileSources.Data parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }
        public static Builder newBuilder(DbFileSources.Data prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE
                    ? new Builder() : new Builder().mergeFrom(this);
        }

        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         * <pre>
         * TODO should be dropped as it prevents streaming
         * </pre>
         *
         * Protobuf type {@code com.linio.sonarqube.source.db.Data}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:com.linio.sonarqube.source.db.Data)
                DbFileSources.DataOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return DbFileSources.internal_static_com_linio_sonarqube_source_db_Data_descriptor;
            }

            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return DbFileSources.internal_static_com_linio_sonarqube_source_db_Data_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                DbFileSources.Data.class, DbFileSources.Data.Builder.class);
            }

            // Construct using com.linio.sonarqube.protobuf.DbFileSources.Data.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }
            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3
                        .alwaysUseFieldBuilders) {
                    getLinesFieldBuilder();
                }
            }
            public Builder clear() {
                super.clear();
                if (linesBuilder_ == null) {
                    lines_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000001);
                } else {
                    linesBuilder_.clear();
                }
                return this;
            }

            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return DbFileSources.internal_static_com_linio_sonarqube_source_db_Data_descriptor;
            }

            public DbFileSources.Data getDefaultInstanceForType() {
                return DbFileSources.Data.getDefaultInstance();
            }

            public DbFileSources.Data build() {
                DbFileSources.Data result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public DbFileSources.Data buildPartial() {
                DbFileSources.Data result = new DbFileSources.Data(this);
                int from_bitField0_ = bitField0_;
                if (linesBuilder_ == null) {
                    if (((bitField0_ & 0x00000001) == 0x00000001)) {
                        lines_ = java.util.Collections.unmodifiableList(lines_);
                        bitField0_ = (bitField0_ & ~0x00000001);
                    }
                    result.lines_ = lines_;
                } else {
                    result.lines_ = linesBuilder_.build();
                }
                onBuilt();
                return result;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return (Builder) super.setField(field, value);
            }
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return (Builder) super.clearField(field);
            }
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return (Builder) super.clearOneof(oneof);
            }
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, Object value) {
                return (Builder) super.setRepeatedField(field, index, value);
            }
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return (Builder) super.addRepeatedField(field, value);
            }
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof DbFileSources.Data) {
                    return mergeFrom((DbFileSources.Data)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(DbFileSources.Data other) {
                if (other == DbFileSources.Data.getDefaultInstance()) return this;
                if (linesBuilder_ == null) {
                    if (!other.lines_.isEmpty()) {
                        if (lines_.isEmpty()) {
                            lines_ = other.lines_;
                            bitField0_ = (bitField0_ & ~0x00000001);
                        } else {
                            ensureLinesIsMutable();
                            lines_.addAll(other.lines_);
                        }
                        onChanged();
                    }
                } else {
                    if (!other.lines_.isEmpty()) {
                        if (linesBuilder_.isEmpty()) {
                            linesBuilder_.dispose();
                            linesBuilder_ = null;
                            lines_ = other.lines_;
                            bitField0_ = (bitField0_ & ~0x00000001);
                            linesBuilder_ =
                                    com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                                            getLinesFieldBuilder() : null;
                        } else {
                            linesBuilder_.addAllMessages(other.lines_);
                        }
                    }
                }
                this.mergeUnknownFields(other.unknownFields);
                onChanged();
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                DbFileSources.Data parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (DbFileSources.Data) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            private int bitField0_;

            private java.util.List<DbFileSources.Line> lines_ =
                    java.util.Collections.emptyList();
            private void ensureLinesIsMutable() {
                if (!((bitField0_ & 0x00000001) == 0x00000001)) {
                    lines_ = new java.util.ArrayList<DbFileSources.Line>(lines_);
                    bitField0_ |= 0x00000001;
                }
            }

            private com.google.protobuf.RepeatedFieldBuilderV3<
                    DbFileSources.Line, DbFileSources.Line.Builder, DbFileSources.LineOrBuilder> linesBuilder_;

            /**
             * <code>repeated .com.linio.sonarqube.source.db.Line lines = 1;</code>
             */
            public java.util.List<DbFileSources.Line> getLinesList() {
                if (linesBuilder_ == null) {
                    return java.util.Collections.unmodifiableList(lines_);
                } else {
                    return linesBuilder_.getMessageList();
                }
            }
            /**
             * <code>repeated .com.linio.sonarqube.source.db.Line lines = 1;</code>
             */
            public int getLinesCount() {
                if (linesBuilder_ == null) {
                    return lines_.size();
                } else {
                    return linesBuilder_.getCount();
                }
            }
            /**
             * <code>repeated .com.linio.sonarqube.source.db.Line lines = 1;</code>
             */
            public DbFileSources.Line getLines(int index) {
                if (linesBuilder_ == null) {
                    return lines_.get(index);
                } else {
                    return linesBuilder_.getMessage(index);
                }
            }
            /**
             * <code>repeated .com.linio.sonarqube.source.db.Line lines = 1;</code>
             */
            public Builder setLines(
                    int index, DbFileSources.Line value) {
                if (linesBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureLinesIsMutable();
                    lines_.set(index, value);
                    onChanged();
                } else {
                    linesBuilder_.setMessage(index, value);
                }
                return this;
            }
            /**
             * <code>repeated .com.linio.sonarqube.source.db.Line lines = 1;</code>
             */
            public Builder setLines(
                    int index, DbFileSources.Line.Builder builderForValue) {
                if (linesBuilder_ == null) {
                    ensureLinesIsMutable();
                    lines_.set(index, builderForValue.build());
                    onChanged();
                } else {
                    linesBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            /**
             * <code>repeated .com.linio.sonarqube.source.db.Line lines = 1;</code>
             */
            public Builder addLines(DbFileSources.Line value) {
                if (linesBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureLinesIsMutable();
                    lines_.add(value);
                    onChanged();
                } else {
                    linesBuilder_.addMessage(value);
                }
                return this;
            }
            /**
             * <code>repeated .com.linio.sonarqube.source.db.Line lines = 1;</code>
             */
            public Builder addLines(
                    int index, DbFileSources.Line value) {
                if (linesBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureLinesIsMutable();
                    lines_.add(index, value);
                    onChanged();
                } else {
                    linesBuilder_.addMessage(index, value);
                }
                return this;
            }
            /**
             * <code>repeated .com.linio.sonarqube.source.db.Line lines = 1;</code>
             */
            public Builder addLines(
                    DbFileSources.Line.Builder builderForValue) {
                if (linesBuilder_ == null) {
                    ensureLinesIsMutable();
                    lines_.add(builderForValue.build());
                    onChanged();
                } else {
                    linesBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            /**
             * <code>repeated .com.linio.sonarqube.source.db.Line lines = 1;</code>
             */
            public Builder addLines(
                    int index, DbFileSources.Line.Builder builderForValue) {
                if (linesBuilder_ == null) {
                    ensureLinesIsMutable();
                    lines_.add(index, builderForValue.build());
                    onChanged();
                } else {
                    linesBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            /**
             * <code>repeated .com.linio.sonarqube.source.db.Line lines = 1;</code>
             */
            public Builder addAllLines(
                    java.lang.Iterable<? extends DbFileSources.Line> values) {
                if (linesBuilder_ == null) {
                    ensureLinesIsMutable();
                    com.google.protobuf.AbstractMessageLite.Builder.addAll(
                            values, lines_);
                    onChanged();
                } else {
                    linesBuilder_.addAllMessages(values);
                }
                return this;
            }
            /**
             * <code>repeated .com.linio.sonarqube.source.db.Line lines = 1;</code>
             */
            public Builder clearLines() {
                if (linesBuilder_ == null) {
                    lines_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000001);
                    onChanged();
                } else {
                    linesBuilder_.clear();
                }
                return this;
            }
            /**
             * <code>repeated .com.linio.sonarqube.source.db.Line lines = 1;</code>
             */
            public Builder removeLines(int index) {
                if (linesBuilder_ == null) {
                    ensureLinesIsMutable();
                    lines_.remove(index);
                    onChanged();
                } else {
                    linesBuilder_.remove(index);
                }
                return this;
            }
            /**
             * <code>repeated .com.linio.sonarqube.source.db.Line lines = 1;</code>
             */
            public DbFileSources.Line.Builder getLinesBuilder(
                    int index) {
                return getLinesFieldBuilder().getBuilder(index);
            }
            /**
             * <code>repeated .com.linio.sonarqube.source.db.Line lines = 1;</code>
             */
            public DbFileSources.LineOrBuilder getLinesOrBuilder(
                    int index) {
                if (linesBuilder_ == null) {
                    return lines_.get(index);  } else {
                    return linesBuilder_.getMessageOrBuilder(index);
                }
            }
            /**
             * <code>repeated .com.linio.sonarqube.source.db.Line lines = 1;</code>
             */
            public java.util.List<? extends DbFileSources.LineOrBuilder>
            getLinesOrBuilderList() {
                if (linesBuilder_ != null) {
                    return linesBuilder_.getMessageOrBuilderList();
                } else {
                    return java.util.Collections.unmodifiableList(lines_);
                }
            }
            /**
             * <code>repeated .com.linio.sonarqube.source.db.Line lines = 1;</code>
             */
            public DbFileSources.Line.Builder addLinesBuilder() {
                return getLinesFieldBuilder().addBuilder(
                        DbFileSources.Line.getDefaultInstance());
            }
            /**
             * <code>repeated .com.linio.sonarqube.source.db.Line lines = 1;</code>
             */
            public DbFileSources.Line.Builder addLinesBuilder(
                    int index) {
                return getLinesFieldBuilder().addBuilder(
                        index, DbFileSources.Line.getDefaultInstance());
            }
            /**
             * <code>repeated .com.linio.sonarqube.source.db.Line lines = 1;</code>
             */
            public java.util.List<DbFileSources.Line.Builder>
            getLinesBuilderList() {
                return getLinesFieldBuilder().getBuilderList();
            }
            private com.google.protobuf.RepeatedFieldBuilderV3<
                    DbFileSources.Line, DbFileSources.Line.Builder, DbFileSources.LineOrBuilder>
            getLinesFieldBuilder() {
                if (linesBuilder_ == null) {
                    linesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
                            DbFileSources.Line, DbFileSources.Line.Builder, DbFileSources.LineOrBuilder>(
                            lines_,
                            ((bitField0_ & 0x00000001) == 0x00000001),
                            getParentForChildren(),
                            isClean());
                    lines_ = null;
                }
                return linesBuilder_;
            }
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }

            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }


            // @@protoc_insertion_point(builder_scope:com.linio.sonarqube.source.db.Data)
        }

        // @@protoc_insertion_point(class_scope:com.linio.sonarqube.source.db.Data)
        private static final DbFileSources.Data DEFAULT_INSTANCE;
        static {
            DEFAULT_INSTANCE = new DbFileSources.Data();
        }

        public static DbFileSources.Data getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        @java.lang.Deprecated public static final com.google.protobuf.Parser<Data>
                PARSER = new com.google.protobuf.AbstractParser<Data>() {
            public Data parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new Data(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<Data> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<Data> getParserForType() {
            return PARSER;
        }

        public DbFileSources.Data getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    public interface TestOrBuilder extends
            // @@protoc_insertion_point(interface_extends:com.linio.sonarqube.source.db.Test)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>optional string uuid = 1;</code>
         */
        boolean hasUuid();
        /**
         * <code>optional string uuid = 1;</code>
         */
        java.lang.String getUuid();
        /**
         * <code>optional string uuid = 1;</code>
         */
        com.google.protobuf.ByteString
        getUuidBytes();

        /**
         * <code>optional string name = 2;</code>
         */
        boolean hasName();
        /**
         * <code>optional string name = 2;</code>
         */
        java.lang.String getName();
        /**
         * <code>optional string name = 2;</code>
         */
        com.google.protobuf.ByteString
        getNameBytes();

        /**
         * <code>optional .com.linio.sonarqube.source.db.Test.TestStatus status = 3;</code>
         */
        boolean hasStatus();
        /**
         * <code>optional .com.linio.sonarqube.source.db.Test.TestStatus status = 3;</code>
         */
        DbFileSources.Test.TestStatus getStatus();

        /**
         * <code>optional int64 execution_time_ms = 4;</code>
         */
        boolean hasExecutionTimeMs();
        /**
         * <code>optional int64 execution_time_ms = 4;</code>
         */
        long getExecutionTimeMs();

        /**
         * <code>optional string stacktrace = 5;</code>
         */
        boolean hasStacktrace();
        /**
         * <code>optional string stacktrace = 5;</code>
         */
        java.lang.String getStacktrace();
        /**
         * <code>optional string stacktrace = 5;</code>
         */
        com.google.protobuf.ByteString
        getStacktraceBytes();

        /**
         * <code>optional string msg = 6;</code>
         */
        boolean hasMsg();
        /**
         * <code>optional string msg = 6;</code>
         */
        java.lang.String getMsg();
        /**
         * <code>optional string msg = 6;</code>
         */
        com.google.protobuf.ByteString
        getMsgBytes();

        /**
         * <code>repeated .com.linio.sonarqube.source.db.Test.CoveredFile covered_file = 7;</code>
         */
        java.util.List<DbFileSources.Test.CoveredFile>
        getCoveredFileList();
        /**
         * <code>repeated .com.linio.sonarqube.source.db.Test.CoveredFile covered_file = 7;</code>
         */
        DbFileSources.Test.CoveredFile getCoveredFile(int index);
        /**
         * <code>repeated .com.linio.sonarqube.source.db.Test.CoveredFile covered_file = 7;</code>
         */
        int getCoveredFileCount();
        /**
         * <code>repeated .com.linio.sonarqube.source.db.Test.CoveredFile covered_file = 7;</code>
         */
        java.util.List<? extends DbFileSources.Test.CoveredFileOrBuilder>
        getCoveredFileOrBuilderList();
        /**
         * <code>repeated .com.linio.sonarqube.source.db.Test.CoveredFile covered_file = 7;</code>
         */
        DbFileSources.Test.CoveredFileOrBuilder getCoveredFileOrBuilder(
                int index);
    }
    /**
     * Protobuf type {@code com.linio.sonarqube.source.db.Test}
     */
    public  static final class Test extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:com.linio.sonarqube.source.db.Test)
            TestOrBuilder {
        // Use Test.newBuilder() to construct.
        private Test(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }
        private Test() {
            uuid_ = "";
            name_ = "";
            status_ = 1;
            executionTimeMs_ = 0L;
            stacktrace_ = "";
            msg_ = "";
            coveredFile_ = java.util.Collections.emptyList();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }
        private Test(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            int mutable_bitField0_ = 0;
            com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                    com.google.protobuf.UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        default: {
                            if (!parseUnknownField(input, unknownFields,
                                    extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                        case 10: {
                            com.google.protobuf.ByteString bs = input.readBytes();
                            bitField0_ |= 0x00000001;
                            uuid_ = bs;
                            break;
                        }
                        case 18: {
                            com.google.protobuf.ByteString bs = input.readBytes();
                            bitField0_ |= 0x00000002;
                            name_ = bs;
                            break;
                        }
                        case 24: {
                            int rawValue = input.readEnum();
                            DbFileSources.Test.TestStatus value = DbFileSources.Test.TestStatus.valueOf(rawValue);
                            if (value == null) {
                                unknownFields.mergeVarintField(3, rawValue);
                            } else {
                                bitField0_ |= 0x00000004;
                                status_ = rawValue;
                            }
                            break;
                        }
                        case 32: {
                            bitField0_ |= 0x00000008;
                            executionTimeMs_ = input.readInt64();
                            break;
                        }
                        case 42: {
                            com.google.protobuf.ByteString bs = input.readBytes();
                            bitField0_ |= 0x00000010;
                            stacktrace_ = bs;
                            break;
                        }
                        case 50: {
                            com.google.protobuf.ByteString bs = input.readBytes();
                            bitField0_ |= 0x00000020;
                            msg_ = bs;
                            break;
                        }
                        case 58: {
                            if (!((mutable_bitField0_ & 0x00000040) == 0x00000040)) {
                                coveredFile_ = new java.util.ArrayList<DbFileSources.Test.CoveredFile>();
                                mutable_bitField0_ |= 0x00000040;
                            }
                            coveredFile_.add(
                                    input.readMessage(DbFileSources.Test.CoveredFile.PARSER, extensionRegistry));
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e).setUnfinishedMessage(this);
            } finally {
                if (((mutable_bitField0_ & 0x00000040) == 0x00000040)) {
                    coveredFile_ = java.util.Collections.unmodifiableList(coveredFile_);
                }
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return DbFileSources.internal_static_com_linio_sonarqube_source_db_Test_descriptor;
        }

        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return DbFileSources.internal_static_com_linio_sonarqube_source_db_Test_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            DbFileSources.Test.class, DbFileSources.Test.Builder.class);
        }

        /**
         * Protobuf enum {@code com.linio.sonarqube.source.db.Test.TestStatus}
         */
        public enum TestStatus
                implements com.google.protobuf.ProtocolMessageEnum {
            /**
             * <code>OK = 1;</code>
             */
            OK(1),
            /**
             * <code>FAILURE = 2;</code>
             */
            FAILURE(2),
            /**
             * <code>ERROR = 3;</code>
             */
            ERROR(3),
            /**
             * <code>SKIPPED = 4;</code>
             */
            SKIPPED(4),
            ;

            /**
             * <code>OK = 1;</code>
             */
            public static final int OK_VALUE = 1;
            /**
             * <code>FAILURE = 2;</code>
             */
            public static final int FAILURE_VALUE = 2;
            /**
             * <code>ERROR = 3;</code>
             */
            public static final int ERROR_VALUE = 3;
            /**
             * <code>SKIPPED = 4;</code>
             */
            public static final int SKIPPED_VALUE = 4;


            public final int getNumber() {
                return value;
            }

            /**
             * @deprecated Use {@link #forNumber(int)} instead.
             */
            @java.lang.Deprecated
            public static TestStatus valueOf(int value) {
                return forNumber(value);
            }

            public static TestStatus forNumber(int value) {
                switch (value) {
                    case 1: return OK;
                    case 2: return FAILURE;
                    case 3: return ERROR;
                    case 4: return SKIPPED;
                    default: return null;
                }
            }

            public static com.google.protobuf.Internal.EnumLiteMap<TestStatus>
            internalGetValueMap() {
                return internalValueMap;
            }
            private static final com.google.protobuf.Internal.EnumLiteMap<
                    TestStatus> internalValueMap =
                    new com.google.protobuf.Internal.EnumLiteMap<TestStatus>() {
                        public TestStatus findValueByNumber(int number) {
                            return TestStatus.forNumber(number);
                        }
                    };

            public final com.google.protobuf.Descriptors.EnumValueDescriptor
            getValueDescriptor() {
                return getDescriptor().getValues().get(ordinal());
            }
            public final com.google.protobuf.Descriptors.EnumDescriptor
            getDescriptorForType() {
                return getDescriptor();
            }
            public static final com.google.protobuf.Descriptors.EnumDescriptor
            getDescriptor() {
                return DbFileSources.Test.getDescriptor().getEnumTypes().get(0);
            }

            private static final TestStatus[] VALUES = values();

            public static TestStatus valueOf(
                    com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
                if (desc.getType() != getDescriptor()) {
                    throw new java.lang.IllegalArgumentException(
                            "EnumValueDescriptor is not for this type.");
                }
                return VALUES[desc.getIndex()];
            }

            private final int value;

            private TestStatus(int value) {
                this.value = value;
            }

            // @@protoc_insertion_point(enum_scope:com.linio.sonarqube.source.db.Test.TestStatus)
        }

        public interface CoveredFileOrBuilder extends
                // @@protoc_insertion_point(interface_extends:com.linio.sonarqube.source.db.Test.CoveredFile)
                com.google.protobuf.MessageOrBuilder {

            /**
             * <code>optional string file_uuid = 1;</code>
             */
            boolean hasFileUuid();
            /**
             * <code>optional string file_uuid = 1;</code>
             */
            java.lang.String getFileUuid();
            /**
             * <code>optional string file_uuid = 1;</code>
             */
            com.google.protobuf.ByteString
            getFileUuidBytes();

            /**
             * <code>repeated int32 covered_line = 2 [packed = true];</code>
             */
            java.util.List<java.lang.Integer> getCoveredLineList();
            /**
             * <code>repeated int32 covered_line = 2 [packed = true];</code>
             */
            int getCoveredLineCount();
            /**
             * <code>repeated int32 covered_line = 2 [packed = true];</code>
             */
            int getCoveredLine(int index);
        }
        /**
         * Protobuf type {@code com.linio.sonarqube.source.db.Test.CoveredFile}
         */
        public  static final class CoveredFile extends
                com.google.protobuf.GeneratedMessageV3 implements
                // @@protoc_insertion_point(message_implements:com.linio.sonarqube.source.db.Test.CoveredFile)
                CoveredFileOrBuilder {
            // Use CoveredFile.newBuilder() to construct.
            private CoveredFile(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
                super(builder);
            }
            private CoveredFile() {
                fileUuid_ = "";
                coveredLine_ = java.util.Collections.emptyList();
            }

            @java.lang.Override
            public final com.google.protobuf.UnknownFieldSet
            getUnknownFields() {
                return this.unknownFields;
            }
            private CoveredFile(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                this();
                int mutable_bitField0_ = 0;
                com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                        com.google.protobuf.UnknownFieldSet.newBuilder();
                try {
                    boolean done = false;
                    while (!done) {
                        int tag = input.readTag();
                        switch (tag) {
                            case 0:
                                done = true;
                                break;
                            default: {
                                if (!parseUnknownField(input, unknownFields,
                                        extensionRegistry, tag)) {
                                    done = true;
                                }
                                break;
                            }
                            case 10: {
                                com.google.protobuf.ByteString bs = input.readBytes();
                                bitField0_ |= 0x00000001;
                                fileUuid_ = bs;
                                break;
                            }
                            case 16: {
                                if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                                    coveredLine_ = new java.util.ArrayList<java.lang.Integer>();
                                    mutable_bitField0_ |= 0x00000002;
                                }
                                coveredLine_.add(input.readInt32());
                                break;
                            }
                            case 18: {
                                int length = input.readRawVarint32();
                                int limit = input.pushLimit(length);
                                if (!((mutable_bitField0_ & 0x00000002) == 0x00000002) && input.getBytesUntilLimit() > 0) {
                                    coveredLine_ = new java.util.ArrayList<java.lang.Integer>();
                                    mutable_bitField0_ |= 0x00000002;
                                }
                                while (input.getBytesUntilLimit() > 0) {
                                    coveredLine_.add(input.readInt32());
                                }
                                input.popLimit(limit);
                                break;
                            }
                        }
                    }
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (java.io.IOException e) {
                    throw new com.google.protobuf.InvalidProtocolBufferException(
                            e).setUnfinishedMessage(this);
                } finally {
                    if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                        coveredLine_ = java.util.Collections.unmodifiableList(coveredLine_);
                    }
                    this.unknownFields = unknownFields.build();
                    makeExtensionsImmutable();
                }
            }
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return DbFileSources.internal_static_com_linio_sonarqube_source_db_Test_CoveredFile_descriptor;
            }

            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return DbFileSources.internal_static_com_linio_sonarqube_source_db_Test_CoveredFile_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                DbFileSources.Test.CoveredFile.class, DbFileSources.Test.CoveredFile.Builder.class);
            }

            private int bitField0_;
            public static final int FILE_UUID_FIELD_NUMBER = 1;
            private volatile java.lang.Object fileUuid_;
            /**
             * <code>optional string file_uuid = 1;</code>
             */
            public boolean hasFileUuid() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }
            /**
             * <code>optional string file_uuid = 1;</code>
             */
            public java.lang.String getFileUuid() {
                java.lang.Object ref = fileUuid_;
                if (ref instanceof java.lang.String) {
                    return (java.lang.String) ref;
                } else {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) {
                        fileUuid_ = s;
                    }
                    return s;
                }
            }
            /**
             * <code>optional string file_uuid = 1;</code>
             */
            public com.google.protobuf.ByteString
            getFileUuidBytes() {
                java.lang.Object ref = fileUuid_;
                if (ref instanceof java.lang.String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    fileUuid_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            public static final int COVERED_LINE_FIELD_NUMBER = 2;
            private java.util.List<java.lang.Integer> coveredLine_;
            /**
             * <code>repeated int32 covered_line = 2 [packed = true];</code>
             */
            public java.util.List<java.lang.Integer>
            getCoveredLineList() {
                return coveredLine_;
            }
            /**
             * <code>repeated int32 covered_line = 2 [packed = true];</code>
             */
            public int getCoveredLineCount() {
                return coveredLine_.size();
            }
            /**
             * <code>repeated int32 covered_line = 2 [packed = true];</code>
             */
            public int getCoveredLine(int index) {
                return coveredLine_.get(index);
            }
            private int coveredLineMemoizedSerializedSize = -1;

            private byte memoizedIsInitialized = -1;
            public final boolean isInitialized() {
                byte isInitialized = memoizedIsInitialized;
                if (isInitialized == 1) return true;
                if (isInitialized == 0) return false;

                memoizedIsInitialized = 1;
                return true;
            }

            public void writeTo(com.google.protobuf.CodedOutputStream output)
                    throws java.io.IOException {
                getSerializedSize();
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                    com.google.protobuf.GeneratedMessageV3.writeString(output, 1, fileUuid_);
                }
                if (getCoveredLineList().size() > 0) {
                    output.writeUInt32NoTag(18);
                    output.writeUInt32NoTag(coveredLineMemoizedSerializedSize);
                }
                for (int i = 0; i < coveredLine_.size(); i++) {
                    output.writeInt32NoTag(coveredLine_.get(i));
                }
                unknownFields.writeTo(output);
            }

            public int getSerializedSize() {
                int size = memoizedSize;
                if (size != -1) return size;

                size = 0;
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                    size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, fileUuid_);
                }
                {
                    int dataSize = 0;
                    for (int i = 0; i < coveredLine_.size(); i++) {
                        dataSize += com.google.protobuf.CodedOutputStream
                                .computeInt32SizeNoTag(coveredLine_.get(i));
                    }
                    size += dataSize;
                    if (!getCoveredLineList().isEmpty()) {
                        size += 1;
                        size += com.google.protobuf.CodedOutputStream
                                .computeInt32SizeNoTag(dataSize);
                    }
                    coveredLineMemoizedSerializedSize = dataSize;
                }
                size += unknownFields.getSerializedSize();
                memoizedSize = size;
                return size;
            }

            private static final long serialVersionUID = 0L;
            @java.lang.Override
            public boolean equals(final java.lang.Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof DbFileSources.Test.CoveredFile)) {
                    return super.equals(obj);
                }
                DbFileSources.Test.CoveredFile other = (DbFileSources.Test.CoveredFile) obj;

                boolean result = true;
                result = result && (hasFileUuid() == other.hasFileUuid());
                if (hasFileUuid()) {
                    result = result && getFileUuid()
                            .equals(other.getFileUuid());
                }
                result = result && getCoveredLineList()
                        .equals(other.getCoveredLineList());
                result = result && unknownFields.equals(other.unknownFields);
                return result;
            }

            @java.lang.Override
            public int hashCode() {
                if (memoizedHashCode != 0) {
                    return memoizedHashCode;
                }
                int hash = 41;
                hash = (19 * hash) + getDescriptor().hashCode();
                if (hasFileUuid()) {
                    hash = (37 * hash) + FILE_UUID_FIELD_NUMBER;
                    hash = (53 * hash) + getFileUuid().hashCode();
                }
                if (getCoveredLineCount() > 0) {
                    hash = (37 * hash) + COVERED_LINE_FIELD_NUMBER;
                    hash = (53 * hash) + getCoveredLineList().hashCode();
                }
                hash = (29 * hash) + unknownFields.hashCode();
                memoizedHashCode = hash;
                return hash;
            }

            public static DbFileSources.Test.CoveredFile parseFrom(
                    com.google.protobuf.ByteString data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static DbFileSources.Test.CoveredFile parseFrom(
                    com.google.protobuf.ByteString data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static DbFileSources.Test.CoveredFile parseFrom(byte[] data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static DbFileSources.Test.CoveredFile parseFrom(
                    byte[] data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static DbFileSources.Test.CoveredFile parseFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input);
            }
            public static DbFileSources.Test.CoveredFile parseFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input, extensionRegistry);
            }
            public static DbFileSources.Test.CoveredFile parseDelimitedFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseDelimitedWithIOException(PARSER, input);
            }
            public static DbFileSources.Test.CoveredFile parseDelimitedFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
            }
            public static DbFileSources.Test.CoveredFile parseFrom(
                    com.google.protobuf.CodedInputStream input)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input);
            }
            public static DbFileSources.Test.CoveredFile parseFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input, extensionRegistry);
            }

            public Builder newBuilderForType() { return newBuilder(); }
            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }
            public static Builder newBuilder(DbFileSources.Test.CoveredFile prototype) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
            }
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE
                        ? new Builder() : new Builder().mergeFrom(this);
            }

            @java.lang.Override
            protected Builder newBuilderForType(
                    com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                Builder builder = new Builder(parent);
                return builder;
            }
            /**
             * Protobuf type {@code com.linio.sonarqube.source.db.Test.CoveredFile}
             */
            public static final class Builder extends
                    com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                    // @@protoc_insertion_point(builder_implements:com.linio.sonarqube.source.db.Test.CoveredFile)
                    DbFileSources.Test.CoveredFileOrBuilder {
                public static final com.google.protobuf.Descriptors.Descriptor
                getDescriptor() {
                    return DbFileSources.internal_static_com_linio_sonarqube_source_db_Test_CoveredFile_descriptor;
                }

                protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
                    return DbFileSources.internal_static_com_linio_sonarqube_source_db_Test_CoveredFile_fieldAccessorTable
                            .ensureFieldAccessorsInitialized(
                                    DbFileSources.Test.CoveredFile.class, DbFileSources.Test.CoveredFile.Builder.class);
                }

                // Construct using com.linio.sonarqube.protobuf.DbFileSources.Test.CoveredFile.newBuilder()
                private Builder() {
                    maybeForceBuilderInitialization();
                }

                private Builder(
                        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                    super(parent);
                    maybeForceBuilderInitialization();
                }
                private void maybeForceBuilderInitialization() {
                    if (com.google.protobuf.GeneratedMessageV3
                            .alwaysUseFieldBuilders) {
                    }
                }
                public Builder clear() {
                    super.clear();
                    fileUuid_ = "";
                    bitField0_ = (bitField0_ & ~0x00000001);
                    coveredLine_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000002);
                    return this;
                }

                public com.google.protobuf.Descriptors.Descriptor
                getDescriptorForType() {
                    return DbFileSources.internal_static_com_linio_sonarqube_source_db_Test_CoveredFile_descriptor;
                }

                public DbFileSources.Test.CoveredFile getDefaultInstanceForType() {
                    return DbFileSources.Test.CoveredFile.getDefaultInstance();
                }

                public DbFileSources.Test.CoveredFile build() {
                    DbFileSources.Test.CoveredFile result = buildPartial();
                    if (!result.isInitialized()) {
                        throw newUninitializedMessageException(result);
                    }
                    return result;
                }

                public DbFileSources.Test.CoveredFile buildPartial() {
                    DbFileSources.Test.CoveredFile result = new DbFileSources.Test.CoveredFile(this);
                    int from_bitField0_ = bitField0_;
                    int to_bitField0_ = 0;
                    if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                        to_bitField0_ |= 0x00000001;
                    }
                    result.fileUuid_ = fileUuid_;
                    if (((bitField0_ & 0x00000002) == 0x00000002)) {
                        coveredLine_ = java.util.Collections.unmodifiableList(coveredLine_);
                        bitField0_ = (bitField0_ & ~0x00000002);
                    }
                    result.coveredLine_ = coveredLine_;
                    result.bitField0_ = to_bitField0_;
                    onBuilt();
                    return result;
                }

                public Builder clone() {
                    return (Builder) super.clone();
                }
                public Builder setField(
                        com.google.protobuf.Descriptors.FieldDescriptor field,
                        Object value) {
                    return (Builder) super.setField(field, value);
                }
                public Builder clearField(
                        com.google.protobuf.Descriptors.FieldDescriptor field) {
                    return (Builder) super.clearField(field);
                }
                public Builder clearOneof(
                        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                    return (Builder) super.clearOneof(oneof);
                }
                public Builder setRepeatedField(
                        com.google.protobuf.Descriptors.FieldDescriptor field,
                        int index, Object value) {
                    return (Builder) super.setRepeatedField(field, index, value);
                }
                public Builder addRepeatedField(
                        com.google.protobuf.Descriptors.FieldDescriptor field,
                        Object value) {
                    return (Builder) super.addRepeatedField(field, value);
                }
                public Builder mergeFrom(com.google.protobuf.Message other) {
                    if (other instanceof DbFileSources.Test.CoveredFile) {
                        return mergeFrom((DbFileSources.Test.CoveredFile)other);
                    } else {
                        super.mergeFrom(other);
                        return this;
                    }
                }

                public Builder mergeFrom(DbFileSources.Test.CoveredFile other) {
                    if (other == DbFileSources.Test.CoveredFile.getDefaultInstance()) return this;
                    if (other.hasFileUuid()) {
                        bitField0_ |= 0x00000001;
                        fileUuid_ = other.fileUuid_;
                        onChanged();
                    }
                    if (!other.coveredLine_.isEmpty()) {
                        if (coveredLine_.isEmpty()) {
                            coveredLine_ = other.coveredLine_;
                            bitField0_ = (bitField0_ & ~0x00000002);
                        } else {
                            ensureCoveredLineIsMutable();
                            coveredLine_.addAll(other.coveredLine_);
                        }
                        onChanged();
                    }
                    this.mergeUnknownFields(other.unknownFields);
                    onChanged();
                    return this;
                }

                public final boolean isInitialized() {
                    return true;
                }

                public Builder mergeFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
                    DbFileSources.Test.CoveredFile parsedMessage = null;
                    try {
                        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                        parsedMessage = (DbFileSources.Test.CoveredFile) e.getUnfinishedMessage();
                        throw e.unwrapIOException();
                    } finally {
                        if (parsedMessage != null) {
                            mergeFrom(parsedMessage);
                        }
                    }
                    return this;
                }
                private int bitField0_;

                private java.lang.Object fileUuid_ = "";
                /**
                 * <code>optional string file_uuid = 1;</code>
                 */
                public boolean hasFileUuid() {
                    return ((bitField0_ & 0x00000001) == 0x00000001);
                }
                /**
                 * <code>optional string file_uuid = 1;</code>
                 */
                public java.lang.String getFileUuid() {
                    java.lang.Object ref = fileUuid_;
                    if (!(ref instanceof java.lang.String)) {
                        com.google.protobuf.ByteString bs =
                                (com.google.protobuf.ByteString) ref;
                        java.lang.String s = bs.toStringUtf8();
                        if (bs.isValidUtf8()) {
                            fileUuid_ = s;
                        }
                        return s;
                    } else {
                        return (java.lang.String) ref;
                    }
                }
                /**
                 * <code>optional string file_uuid = 1;</code>
                 */
                public com.google.protobuf.ByteString
                getFileUuidBytes() {
                    java.lang.Object ref = fileUuid_;
                    if (ref instanceof String) {
                        com.google.protobuf.ByteString b =
                                com.google.protobuf.ByteString.copyFromUtf8(
                                        (java.lang.String) ref);
                        fileUuid_ = b;
                        return b;
                    } else {
                        return (com.google.protobuf.ByteString) ref;
                    }
                }
                /**
                 * <code>optional string file_uuid = 1;</code>
                 */
                public Builder setFileUuid(
                        java.lang.String value) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    bitField0_ |= 0x00000001;
                    fileUuid_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <code>optional string file_uuid = 1;</code>
                 */
                public Builder clearFileUuid() {
                    bitField0_ = (bitField0_ & ~0x00000001);
                    fileUuid_ = getDefaultInstance().getFileUuid();
                    onChanged();
                    return this;
                }
                /**
                 * <code>optional string file_uuid = 1;</code>
                 */
                public Builder setFileUuidBytes(
                        com.google.protobuf.ByteString value) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    bitField0_ |= 0x00000001;
                    fileUuid_ = value;
                    onChanged();
                    return this;
                }

                private java.util.List<java.lang.Integer> coveredLine_ = java.util.Collections.emptyList();
                private void ensureCoveredLineIsMutable() {
                    if (!((bitField0_ & 0x00000002) == 0x00000002)) {
                        coveredLine_ = new java.util.ArrayList<java.lang.Integer>(coveredLine_);
                        bitField0_ |= 0x00000002;
                    }
                }
                /**
                 * <code>repeated int32 covered_line = 2 [packed = true];</code>
                 */
                public java.util.List<java.lang.Integer>
                getCoveredLineList() {
                    return java.util.Collections.unmodifiableList(coveredLine_);
                }
                /**
                 * <code>repeated int32 covered_line = 2 [packed = true];</code>
                 */
                public int getCoveredLineCount() {
                    return coveredLine_.size();
                }
                /**
                 * <code>repeated int32 covered_line = 2 [packed = true];</code>
                 */
                public int getCoveredLine(int index) {
                    return coveredLine_.get(index);
                }
                /**
                 * <code>repeated int32 covered_line = 2 [packed = true];</code>
                 */
                public Builder setCoveredLine(
                        int index, int value) {
                    ensureCoveredLineIsMutable();
                    coveredLine_.set(index, value);
                    onChanged();
                    return this;
                }
                /**
                 * <code>repeated int32 covered_line = 2 [packed = true];</code>
                 */
                public Builder addCoveredLine(int value) {
                    ensureCoveredLineIsMutable();
                    coveredLine_.add(value);
                    onChanged();
                    return this;
                }
                /**
                 * <code>repeated int32 covered_line = 2 [packed = true];</code>
                 */
                public Builder addAllCoveredLine(
                        java.lang.Iterable<? extends java.lang.Integer> values) {
                    ensureCoveredLineIsMutable();
                    com.google.protobuf.AbstractMessageLite.Builder.addAll(
                            values, coveredLine_);
                    onChanged();
                    return this;
                }
                /**
                 * <code>repeated int32 covered_line = 2 [packed = true];</code>
                 */
                public Builder clearCoveredLine() {
                    coveredLine_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000002);
                    onChanged();
                    return this;
                }
                public final Builder setUnknownFields(
                        final com.google.protobuf.UnknownFieldSet unknownFields) {
                    return super.setUnknownFields(unknownFields);
                }

                public final Builder mergeUnknownFields(
                        final com.google.protobuf.UnknownFieldSet unknownFields) {
                    return super.mergeUnknownFields(unknownFields);
                }


                // @@protoc_insertion_point(builder_scope:com.linio.sonarqube.source.db.Test.CoveredFile)
            }

            // @@protoc_insertion_point(class_scope:com.linio.sonarqube.source.db.Test.CoveredFile)
            private static final DbFileSources.Test.CoveredFile DEFAULT_INSTANCE;
            static {
                DEFAULT_INSTANCE = new DbFileSources.Test.CoveredFile();
            }

            public static DbFileSources.Test.CoveredFile getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            @java.lang.Deprecated public static final com.google.protobuf.Parser<CoveredFile>
                    PARSER = new com.google.protobuf.AbstractParser<CoveredFile>() {
                public CoveredFile parsePartialFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
                    return new CoveredFile(input, extensionRegistry);
                }
            };

            public static com.google.protobuf.Parser<CoveredFile> parser() {
                return PARSER;
            }

            @java.lang.Override
            public com.google.protobuf.Parser<CoveredFile> getParserForType() {
                return PARSER;
            }

            public DbFileSources.Test.CoveredFile getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

        }

        private int bitField0_;
        public static final int UUID_FIELD_NUMBER = 1;
        private volatile java.lang.Object uuid_;
        /**
         * <code>optional string uuid = 1;</code>
         */
        public boolean hasUuid() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }
        /**
         * <code>optional string uuid = 1;</code>
         */
        public java.lang.String getUuid() {
            java.lang.Object ref = uuid_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                    uuid_ = s;
                }
                return s;
            }
        }
        /**
         * <code>optional string uuid = 1;</code>
         */
        public com.google.protobuf.ByteString
        getUuidBytes() {
            java.lang.Object ref = uuid_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                uuid_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int NAME_FIELD_NUMBER = 2;
        private volatile java.lang.Object name_;
        /**
         * <code>optional string name = 2;</code>
         */
        public boolean hasName() {
            return ((bitField0_ & 0x00000002) == 0x00000002);
        }
        /**
         * <code>optional string name = 2;</code>
         */
        public java.lang.String getName() {
            java.lang.Object ref = name_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                    name_ = s;
                }
                return s;
            }
        }
        /**
         * <code>optional string name = 2;</code>
         */
        public com.google.protobuf.ByteString
        getNameBytes() {
            java.lang.Object ref = name_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                name_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int STATUS_FIELD_NUMBER = 3;
        private int status_;
        /**
         * <code>optional .com.linio.sonarqube.source.db.Test.TestStatus status = 3;</code>
         */
        public boolean hasStatus() {
            return ((bitField0_ & 0x00000004) == 0x00000004);
        }
        /**
         * <code>optional .com.linio.sonarqube.source.db.Test.TestStatus status = 3;</code>
         */
        public DbFileSources.Test.TestStatus getStatus() {
            DbFileSources.Test.TestStatus result = DbFileSources.Test.TestStatus.valueOf(status_);
            return result == null ? DbFileSources.Test.TestStatus.OK : result;
        }

        public static final int EXECUTION_TIME_MS_FIELD_NUMBER = 4;
        private long executionTimeMs_;
        /**
         * <code>optional int64 execution_time_ms = 4;</code>
         */
        public boolean hasExecutionTimeMs() {
            return ((bitField0_ & 0x00000008) == 0x00000008);
        }
        /**
         * <code>optional int64 execution_time_ms = 4;</code>
         */
        public long getExecutionTimeMs() {
            return executionTimeMs_;
        }

        public static final int STACKTRACE_FIELD_NUMBER = 5;
        private volatile java.lang.Object stacktrace_;
        /**
         * <code>optional string stacktrace = 5;</code>
         */
        public boolean hasStacktrace() {
            return ((bitField0_ & 0x00000010) == 0x00000010);
        }
        /**
         * <code>optional string stacktrace = 5;</code>
         */
        public java.lang.String getStacktrace() {
            java.lang.Object ref = stacktrace_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                    stacktrace_ = s;
                }
                return s;
            }
        }
        /**
         * <code>optional string stacktrace = 5;</code>
         */
        public com.google.protobuf.ByteString
        getStacktraceBytes() {
            java.lang.Object ref = stacktrace_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                stacktrace_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int MSG_FIELD_NUMBER = 6;
        private volatile java.lang.Object msg_;
        /**
         * <code>optional string msg = 6;</code>
         */
        public boolean hasMsg() {
            return ((bitField0_ & 0x00000020) == 0x00000020);
        }
        /**
         * <code>optional string msg = 6;</code>
         */
        public java.lang.String getMsg() {
            java.lang.Object ref = msg_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                    msg_ = s;
                }
                return s;
            }
        }
        /**
         * <code>optional string msg = 6;</code>
         */
        public com.google.protobuf.ByteString
        getMsgBytes() {
            java.lang.Object ref = msg_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                msg_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int COVERED_FILE_FIELD_NUMBER = 7;
        private java.util.List<DbFileSources.Test.CoveredFile> coveredFile_;
        /**
         * <code>repeated .com.linio.sonarqube.source.db.Test.CoveredFile covered_file = 7;</code>
         */
        public java.util.List<DbFileSources.Test.CoveredFile> getCoveredFileList() {
            return coveredFile_;
        }
        /**
         * <code>repeated .com.linio.sonarqube.source.db.Test.CoveredFile covered_file = 7;</code>
         */
        public java.util.List<? extends DbFileSources.Test.CoveredFileOrBuilder>
        getCoveredFileOrBuilderList() {
            return coveredFile_;
        }
        /**
         * <code>repeated .com.linio.sonarqube.source.db.Test.CoveredFile covered_file = 7;</code>
         */
        public int getCoveredFileCount() {
            return coveredFile_.size();
        }
        /**
         * <code>repeated .com.linio.sonarqube.source.db.Test.CoveredFile covered_file = 7;</code>
         */
        public DbFileSources.Test.CoveredFile getCoveredFile(int index) {
            return coveredFile_.get(index);
        }
        /**
         * <code>repeated .com.linio.sonarqube.source.db.Test.CoveredFile covered_file = 7;</code>
         */
        public DbFileSources.Test.CoveredFileOrBuilder getCoveredFileOrBuilder(
                int index) {
            return coveredFile_.get(index);
        }

        private byte memoizedIsInitialized = -1;
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 1, uuid_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 2, name_);
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                output.writeEnum(3, status_);
            }
            if (((bitField0_ & 0x00000008) == 0x00000008)) {
                output.writeInt64(4, executionTimeMs_);
            }
            if (((bitField0_ & 0x00000010) == 0x00000010)) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 5, stacktrace_);
            }
            if (((bitField0_ & 0x00000020) == 0x00000020)) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 6, msg_);
            }
            for (int i = 0; i < coveredFile_.size(); i++) {
                output.writeMessage(7, coveredFile_.get(i));
            }
            unknownFields.writeTo(output);
        }

        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, uuid_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, name_);
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeEnumSize(3, status_);
            }
            if (((bitField0_ & 0x00000008) == 0x00000008)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt64Size(4, executionTimeMs_);
            }
            if (((bitField0_ & 0x00000010) == 0x00000010)) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, stacktrace_);
            }
            if (((bitField0_ & 0x00000020) == 0x00000020)) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, msg_);
            }
            for (int i = 0; i < coveredFile_.size(); i++) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(7, coveredFile_.get(i));
            }
            size += unknownFields.getSerializedSize();
            memoizedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;
        @java.lang.Override
        public boolean equals(final java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DbFileSources.Test)) {
                return super.equals(obj);
            }
            DbFileSources.Test other = (DbFileSources.Test) obj;

            boolean result = true;
            result = result && (hasUuid() == other.hasUuid());
            if (hasUuid()) {
                result = result && getUuid()
                        .equals(other.getUuid());
            }
            result = result && (hasName() == other.hasName());
            if (hasName()) {
                result = result && getName()
                        .equals(other.getName());
            }
            result = result && (hasStatus() == other.hasStatus());
            if (hasStatus()) {
                result = result && status_ == other.status_;
            }
            result = result && (hasExecutionTimeMs() == other.hasExecutionTimeMs());
            if (hasExecutionTimeMs()) {
                result = result && (getExecutionTimeMs()
                        == other.getExecutionTimeMs());
            }
            result = result && (hasStacktrace() == other.hasStacktrace());
            if (hasStacktrace()) {
                result = result && getStacktrace()
                        .equals(other.getStacktrace());
            }
            result = result && (hasMsg() == other.hasMsg());
            if (hasMsg()) {
                result = result && getMsg()
                        .equals(other.getMsg());
            }
            result = result && getCoveredFileList()
                    .equals(other.getCoveredFileList());
            result = result && unknownFields.equals(other.unknownFields);
            return result;
        }

        @java.lang.Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            if (hasUuid()) {
                hash = (37 * hash) + UUID_FIELD_NUMBER;
                hash = (53 * hash) + getUuid().hashCode();
            }
            if (hasName()) {
                hash = (37 * hash) + NAME_FIELD_NUMBER;
                hash = (53 * hash) + getName().hashCode();
            }
            if (hasStatus()) {
                hash = (37 * hash) + STATUS_FIELD_NUMBER;
                hash = (53 * hash) + status_;
            }
            if (hasExecutionTimeMs()) {
                hash = (37 * hash) + EXECUTION_TIME_MS_FIELD_NUMBER;
                hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
                        getExecutionTimeMs());
            }
            if (hasStacktrace()) {
                hash = (37 * hash) + STACKTRACE_FIELD_NUMBER;
                hash = (53 * hash) + getStacktrace().hashCode();
            }
            if (hasMsg()) {
                hash = (37 * hash) + MSG_FIELD_NUMBER;
                hash = (53 * hash) + getMsg().hashCode();
            }
            if (getCoveredFileCount() > 0) {
                hash = (37 * hash) + COVERED_FILE_FIELD_NUMBER;
                hash = (53 * hash) + getCoveredFileList().hashCode();
            }
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static DbFileSources.Test parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static DbFileSources.Test parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static DbFileSources.Test parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static DbFileSources.Test parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static DbFileSources.Test parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static DbFileSources.Test parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }
        public static DbFileSources.Test parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }
        public static DbFileSources.Test parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }
        public static DbFileSources.Test parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static DbFileSources.Test parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }
        public static Builder newBuilder(DbFileSources.Test prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE
                    ? new Builder() : new Builder().mergeFrom(this);
        }

        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         * Protobuf type {@code com.linio.sonarqube.source.db.Test}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:com.linio.sonarqube.source.db.Test)
                DbFileSources.TestOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return DbFileSources.internal_static_com_linio_sonarqube_source_db_Test_descriptor;
            }

            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return DbFileSources.internal_static_com_linio_sonarqube_source_db_Test_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                DbFileSources.Test.class, DbFileSources.Test.Builder.class);
            }

            // Construct using com.linio.sonarqube.protobuf.DbFileSources.Test.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }
            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3
                        .alwaysUseFieldBuilders) {
                    getCoveredFileFieldBuilder();
                }
            }
            public Builder clear() {
                super.clear();
                uuid_ = "";
                bitField0_ = (bitField0_ & ~0x00000001);
                name_ = "";
                bitField0_ = (bitField0_ & ~0x00000002);
                status_ = 1;
                bitField0_ = (bitField0_ & ~0x00000004);
                executionTimeMs_ = 0L;
                bitField0_ = (bitField0_ & ~0x00000008);
                stacktrace_ = "";
                bitField0_ = (bitField0_ & ~0x00000010);
                msg_ = "";
                bitField0_ = (bitField0_ & ~0x00000020);
                if (coveredFileBuilder_ == null) {
                    coveredFile_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000040);
                } else {
                    coveredFileBuilder_.clear();
                }
                return this;
            }

            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return DbFileSources.internal_static_com_linio_sonarqube_source_db_Test_descriptor;
            }

            public DbFileSources.Test getDefaultInstanceForType() {
                return DbFileSources.Test.getDefaultInstance();
            }

            public DbFileSources.Test build() {
                DbFileSources.Test result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public DbFileSources.Test buildPartial() {
                DbFileSources.Test result = new DbFileSources.Test(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                    to_bitField0_ |= 0x00000001;
                }
                result.uuid_ = uuid_;
                if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                    to_bitField0_ |= 0x00000002;
                }
                result.name_ = name_;
                if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
                    to_bitField0_ |= 0x00000004;
                }
                result.status_ = status_;
                if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
                    to_bitField0_ |= 0x00000008;
                }
                result.executionTimeMs_ = executionTimeMs_;
                if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
                    to_bitField0_ |= 0x00000010;
                }
                result.stacktrace_ = stacktrace_;
                if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
                    to_bitField0_ |= 0x00000020;
                }
                result.msg_ = msg_;
                if (coveredFileBuilder_ == null) {
                    if (((bitField0_ & 0x00000040) == 0x00000040)) {
                        coveredFile_ = java.util.Collections.unmodifiableList(coveredFile_);
                        bitField0_ = (bitField0_ & ~0x00000040);
                    }
                    result.coveredFile_ = coveredFile_;
                } else {
                    result.coveredFile_ = coveredFileBuilder_.build();
                }
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return (Builder) super.setField(field, value);
            }
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return (Builder) super.clearField(field);
            }
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return (Builder) super.clearOneof(oneof);
            }
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, Object value) {
                return (Builder) super.setRepeatedField(field, index, value);
            }
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return (Builder) super.addRepeatedField(field, value);
            }
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof DbFileSources.Test) {
                    return mergeFrom((DbFileSources.Test)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(DbFileSources.Test other) {
                if (other == DbFileSources.Test.getDefaultInstance()) return this;
                if (other.hasUuid()) {
                    bitField0_ |= 0x00000001;
                    uuid_ = other.uuid_;
                    onChanged();
                }
                if (other.hasName()) {
                    bitField0_ |= 0x00000002;
                    name_ = other.name_;
                    onChanged();
                }
                if (other.hasStatus()) {
                    setStatus(other.getStatus());
                }
                if (other.hasExecutionTimeMs()) {
                    setExecutionTimeMs(other.getExecutionTimeMs());
                }
                if (other.hasStacktrace()) {
                    bitField0_ |= 0x00000010;
                    stacktrace_ = other.stacktrace_;
                    onChanged();
                }
                if (other.hasMsg()) {
                    bitField0_ |= 0x00000020;
                    msg_ = other.msg_;
                    onChanged();
                }
                if (coveredFileBuilder_ == null) {
                    if (!other.coveredFile_.isEmpty()) {
                        if (coveredFile_.isEmpty()) {
                            coveredFile_ = other.coveredFile_;
                            bitField0_ = (bitField0_ & ~0x00000040);
                        } else {
                            ensureCoveredFileIsMutable();
                            coveredFile_.addAll(other.coveredFile_);
                        }
                        onChanged();
                    }
                } else {
                    if (!other.coveredFile_.isEmpty()) {
                        if (coveredFileBuilder_.isEmpty()) {
                            coveredFileBuilder_.dispose();
                            coveredFileBuilder_ = null;
                            coveredFile_ = other.coveredFile_;
                            bitField0_ = (bitField0_ & ~0x00000040);
                            coveredFileBuilder_ =
                                    com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                                            getCoveredFileFieldBuilder() : null;
                        } else {
                            coveredFileBuilder_.addAllMessages(other.coveredFile_);
                        }
                    }
                }
                this.mergeUnknownFields(other.unknownFields);
                onChanged();
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                DbFileSources.Test parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (DbFileSources.Test) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            private int bitField0_;

            private java.lang.Object uuid_ = "";
            /**
             * <code>optional string uuid = 1;</code>
             */
            public boolean hasUuid() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }
            /**
             * <code>optional string uuid = 1;</code>
             */
            public java.lang.String getUuid() {
                java.lang.Object ref = uuid_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) {
                        uuid_ = s;
                    }
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }
            /**
             * <code>optional string uuid = 1;</code>
             */
            public com.google.protobuf.ByteString
            getUuidBytes() {
                java.lang.Object ref = uuid_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    uuid_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>optional string uuid = 1;</code>
             */
            public Builder setUuid(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000001;
                uuid_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional string uuid = 1;</code>
             */
            public Builder clearUuid() {
                bitField0_ = (bitField0_ & ~0x00000001);
                uuid_ = getDefaultInstance().getUuid();
                onChanged();
                return this;
            }
            /**
             * <code>optional string uuid = 1;</code>
             */
            public Builder setUuidBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000001;
                uuid_ = value;
                onChanged();
                return this;
            }

            private java.lang.Object name_ = "";
            /**
             * <code>optional string name = 2;</code>
             */
            public boolean hasName() {
                return ((bitField0_ & 0x00000002) == 0x00000002);
            }
            /**
             * <code>optional string name = 2;</code>
             */
            public java.lang.String getName() {
                java.lang.Object ref = name_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) {
                        name_ = s;
                    }
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }
            /**
             * <code>optional string name = 2;</code>
             */
            public com.google.protobuf.ByteString
            getNameBytes() {
                java.lang.Object ref = name_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    name_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>optional string name = 2;</code>
             */
            public Builder setName(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000002;
                name_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional string name = 2;</code>
             */
            public Builder clearName() {
                bitField0_ = (bitField0_ & ~0x00000002);
                name_ = getDefaultInstance().getName();
                onChanged();
                return this;
            }
            /**
             * <code>optional string name = 2;</code>
             */
            public Builder setNameBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000002;
                name_ = value;
                onChanged();
                return this;
            }

            private int status_ = 1;
            /**
             * <code>optional .com.linio.sonarqube.source.db.Test.TestStatus status = 3;</code>
             */
            public boolean hasStatus() {
                return ((bitField0_ & 0x00000004) == 0x00000004);
            }
            /**
             * <code>optional .com.linio.sonarqube.source.db.Test.TestStatus status = 3;</code>
             */
            public DbFileSources.Test.TestStatus getStatus() {
                DbFileSources.Test.TestStatus result = DbFileSources.Test.TestStatus.valueOf(status_);
                return result == null ? DbFileSources.Test.TestStatus.OK : result;
            }
            /**
             * <code>optional .com.linio.sonarqube.source.db.Test.TestStatus status = 3;</code>
             */
            public Builder setStatus(DbFileSources.Test.TestStatus value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000004;
                status_ = value.getNumber();
                onChanged();
                return this;
            }
            /**
             * <code>optional .com.linio.sonarqube.source.db.Test.TestStatus status = 3;</code>
             */
            public Builder clearStatus() {
                bitField0_ = (bitField0_ & ~0x00000004);
                status_ = 1;
                onChanged();
                return this;
            }

            private long executionTimeMs_ ;
            /**
             * <code>optional int64 execution_time_ms = 4;</code>
             */
            public boolean hasExecutionTimeMs() {
                return ((bitField0_ & 0x00000008) == 0x00000008);
            }
            /**
             * <code>optional int64 execution_time_ms = 4;</code>
             */
            public long getExecutionTimeMs() {
                return executionTimeMs_;
            }
            /**
             * <code>optional int64 execution_time_ms = 4;</code>
             */
            public Builder setExecutionTimeMs(long value) {
                bitField0_ |= 0x00000008;
                executionTimeMs_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional int64 execution_time_ms = 4;</code>
             */
            public Builder clearExecutionTimeMs() {
                bitField0_ = (bitField0_ & ~0x00000008);
                executionTimeMs_ = 0L;
                onChanged();
                return this;
            }

            private java.lang.Object stacktrace_ = "";
            /**
             * <code>optional string stacktrace = 5;</code>
             */
            public boolean hasStacktrace() {
                return ((bitField0_ & 0x00000010) == 0x00000010);
            }
            /**
             * <code>optional string stacktrace = 5;</code>
             */
            public java.lang.String getStacktrace() {
                java.lang.Object ref = stacktrace_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) {
                        stacktrace_ = s;
                    }
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }
            /**
             * <code>optional string stacktrace = 5;</code>
             */
            public com.google.protobuf.ByteString
            getStacktraceBytes() {
                java.lang.Object ref = stacktrace_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    stacktrace_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>optional string stacktrace = 5;</code>
             */
            public Builder setStacktrace(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000010;
                stacktrace_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional string stacktrace = 5;</code>
             */
            public Builder clearStacktrace() {
                bitField0_ = (bitField0_ & ~0x00000010);
                stacktrace_ = getDefaultInstance().getStacktrace();
                onChanged();
                return this;
            }
            /**
             * <code>optional string stacktrace = 5;</code>
             */
            public Builder setStacktraceBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000010;
                stacktrace_ = value;
                onChanged();
                return this;
            }

            private java.lang.Object msg_ = "";
            /**
             * <code>optional string msg = 6;</code>
             */
            public boolean hasMsg() {
                return ((bitField0_ & 0x00000020) == 0x00000020);
            }
            /**
             * <code>optional string msg = 6;</code>
             */
            public java.lang.String getMsg() {
                java.lang.Object ref = msg_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) {
                        msg_ = s;
                    }
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }
            /**
             * <code>optional string msg = 6;</code>
             */
            public com.google.protobuf.ByteString
            getMsgBytes() {
                java.lang.Object ref = msg_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    msg_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>optional string msg = 6;</code>
             */
            public Builder setMsg(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000020;
                msg_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional string msg = 6;</code>
             */
            public Builder clearMsg() {
                bitField0_ = (bitField0_ & ~0x00000020);
                msg_ = getDefaultInstance().getMsg();
                onChanged();
                return this;
            }
            /**
             * <code>optional string msg = 6;</code>
             */
            public Builder setMsgBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000020;
                msg_ = value;
                onChanged();
                return this;
            }

            private java.util.List<DbFileSources.Test.CoveredFile> coveredFile_ =
                    java.util.Collections.emptyList();
            private void ensureCoveredFileIsMutable() {
                if (!((bitField0_ & 0x00000040) == 0x00000040)) {
                    coveredFile_ = new java.util.ArrayList<DbFileSources.Test.CoveredFile>(coveredFile_);
                    bitField0_ |= 0x00000040;
                }
            }

            private com.google.protobuf.RepeatedFieldBuilderV3<
                    DbFileSources.Test.CoveredFile, DbFileSources.Test.CoveredFile.Builder, DbFileSources.Test.CoveredFileOrBuilder> coveredFileBuilder_;

            /**
             * <code>repeated .com.linio.sonarqube.source.db.Test.CoveredFile covered_file = 7;</code>
             */
            public java.util.List<DbFileSources.Test.CoveredFile> getCoveredFileList() {
                if (coveredFileBuilder_ == null) {
                    return java.util.Collections.unmodifiableList(coveredFile_);
                } else {
                    return coveredFileBuilder_.getMessageList();
                }
            }
            /**
             * <code>repeated .com.linio.sonarqube.source.db.Test.CoveredFile covered_file = 7;</code>
             */
            public int getCoveredFileCount() {
                if (coveredFileBuilder_ == null) {
                    return coveredFile_.size();
                } else {
                    return coveredFileBuilder_.getCount();
                }
            }
            /**
             * <code>repeated .com.linio.sonarqube.source.db.Test.CoveredFile covered_file = 7;</code>
             */
            public DbFileSources.Test.CoveredFile getCoveredFile(int index) {
                if (coveredFileBuilder_ == null) {
                    return coveredFile_.get(index);
                } else {
                    return coveredFileBuilder_.getMessage(index);
                }
            }
            /**
             * <code>repeated .com.linio.sonarqube.source.db.Test.CoveredFile covered_file = 7;</code>
             */
            public Builder setCoveredFile(
                    int index, DbFileSources.Test.CoveredFile value) {
                if (coveredFileBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureCoveredFileIsMutable();
                    coveredFile_.set(index, value);
                    onChanged();
                } else {
                    coveredFileBuilder_.setMessage(index, value);
                }
                return this;
            }
            /**
             * <code>repeated .com.linio.sonarqube.source.db.Test.CoveredFile covered_file = 7;</code>
             */
            public Builder setCoveredFile(
                    int index, DbFileSources.Test.CoveredFile.Builder builderForValue) {
                if (coveredFileBuilder_ == null) {
                    ensureCoveredFileIsMutable();
                    coveredFile_.set(index, builderForValue.build());
                    onChanged();
                } else {
                    coveredFileBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            /**
             * <code>repeated .com.linio.sonarqube.source.db.Test.CoveredFile covered_file = 7;</code>
             */
            public Builder addCoveredFile(DbFileSources.Test.CoveredFile value) {
                if (coveredFileBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureCoveredFileIsMutable();
                    coveredFile_.add(value);
                    onChanged();
                } else {
                    coveredFileBuilder_.addMessage(value);
                }
                return this;
            }
            /**
             * <code>repeated .com.linio.sonarqube.source.db.Test.CoveredFile covered_file = 7;</code>
             */
            public Builder addCoveredFile(
                    int index, DbFileSources.Test.CoveredFile value) {
                if (coveredFileBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureCoveredFileIsMutable();
                    coveredFile_.add(index, value);
                    onChanged();
                } else {
                    coveredFileBuilder_.addMessage(index, value);
                }
                return this;
            }
            /**
             * <code>repeated .com.linio.sonarqube.source.db.Test.CoveredFile covered_file = 7;</code>
             */
            public Builder addCoveredFile(
                    DbFileSources.Test.CoveredFile.Builder builderForValue) {
                if (coveredFileBuilder_ == null) {
                    ensureCoveredFileIsMutable();
                    coveredFile_.add(builderForValue.build());
                    onChanged();
                } else {
                    coveredFileBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            /**
             * <code>repeated .com.linio.sonarqube.source.db.Test.CoveredFile covered_file = 7;</code>
             */
            public Builder addCoveredFile(
                    int index, DbFileSources.Test.CoveredFile.Builder builderForValue) {
                if (coveredFileBuilder_ == null) {
                    ensureCoveredFileIsMutable();
                    coveredFile_.add(index, builderForValue.build());
                    onChanged();
                } else {
                    coveredFileBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            /**
             * <code>repeated .com.linio.sonarqube.source.db.Test.CoveredFile covered_file = 7;</code>
             */
            public Builder addAllCoveredFile(
                    java.lang.Iterable<? extends DbFileSources.Test.CoveredFile> values) {
                if (coveredFileBuilder_ == null) {
                    ensureCoveredFileIsMutable();
                    com.google.protobuf.AbstractMessageLite.Builder.addAll(
                            values, coveredFile_);
                    onChanged();
                } else {
                    coveredFileBuilder_.addAllMessages(values);
                }
                return this;
            }
            /**
             * <code>repeated .com.linio.sonarqube.source.db.Test.CoveredFile covered_file = 7;</code>
             */
            public Builder clearCoveredFile() {
                if (coveredFileBuilder_ == null) {
                    coveredFile_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000040);
                    onChanged();
                } else {
                    coveredFileBuilder_.clear();
                }
                return this;
            }
            /**
             * <code>repeated .com.linio.sonarqube.source.db.Test.CoveredFile covered_file = 7;</code>
             */
            public Builder removeCoveredFile(int index) {
                if (coveredFileBuilder_ == null) {
                    ensureCoveredFileIsMutable();
                    coveredFile_.remove(index);
                    onChanged();
                } else {
                    coveredFileBuilder_.remove(index);
                }
                return this;
            }
            /**
             * <code>repeated .com.linio.sonarqube.source.db.Test.CoveredFile covered_file = 7;</code>
             */
            public DbFileSources.Test.CoveredFile.Builder getCoveredFileBuilder(
                    int index) {
                return getCoveredFileFieldBuilder().getBuilder(index);
            }
            /**
             * <code>repeated .com.linio.sonarqube.source.db.Test.CoveredFile covered_file = 7;</code>
             */
            public DbFileSources.Test.CoveredFileOrBuilder getCoveredFileOrBuilder(
                    int index) {
                if (coveredFileBuilder_ == null) {
                    return coveredFile_.get(index);  } else {
                    return coveredFileBuilder_.getMessageOrBuilder(index);
                }
            }
            /**
             * <code>repeated .com.linio.sonarqube.source.db.Test.CoveredFile covered_file = 7;</code>
             */
            public java.util.List<? extends DbFileSources.Test.CoveredFileOrBuilder>
            getCoveredFileOrBuilderList() {
                if (coveredFileBuilder_ != null) {
                    return coveredFileBuilder_.getMessageOrBuilderList();
                } else {
                    return java.util.Collections.unmodifiableList(coveredFile_);
                }
            }
            /**
             * <code>repeated .com.linio.sonarqube.source.db.Test.CoveredFile covered_file = 7;</code>
             */
            public DbFileSources.Test.CoveredFile.Builder addCoveredFileBuilder() {
                return getCoveredFileFieldBuilder().addBuilder(
                        DbFileSources.Test.CoveredFile.getDefaultInstance());
            }
            /**
             * <code>repeated .com.linio.sonarqube.source.db.Test.CoveredFile covered_file = 7;</code>
             */
            public DbFileSources.Test.CoveredFile.Builder addCoveredFileBuilder(
                    int index) {
                return getCoveredFileFieldBuilder().addBuilder(
                        index, DbFileSources.Test.CoveredFile.getDefaultInstance());
            }
            /**
             * <code>repeated .com.linio.sonarqube.source.db.Test.CoveredFile covered_file = 7;</code>
             */
            public java.util.List<DbFileSources.Test.CoveredFile.Builder>
            getCoveredFileBuilderList() {
                return getCoveredFileFieldBuilder().getBuilderList();
            }
            private com.google.protobuf.RepeatedFieldBuilderV3<
                    DbFileSources.Test.CoveredFile, DbFileSources.Test.CoveredFile.Builder, DbFileSources.Test.CoveredFileOrBuilder>
            getCoveredFileFieldBuilder() {
                if (coveredFileBuilder_ == null) {
                    coveredFileBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
                            DbFileSources.Test.CoveredFile, DbFileSources.Test.CoveredFile.Builder, DbFileSources.Test.CoveredFileOrBuilder>(
                            coveredFile_,
                            ((bitField0_ & 0x00000040) == 0x00000040),
                            getParentForChildren(),
                            isClean());
                    coveredFile_ = null;
                }
                return coveredFileBuilder_;
            }
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }

            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }


            // @@protoc_insertion_point(builder_scope:com.linio.sonarqube.source.db.Test)
        }

        // @@protoc_insertion_point(class_scope:com.linio.sonarqube.source.db.Test)
        private static final DbFileSources.Test DEFAULT_INSTANCE;
        static {
            DEFAULT_INSTANCE = new DbFileSources.Test();
        }

        public static DbFileSources.Test getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        @java.lang.Deprecated public static final com.google.protobuf.Parser<Test>
                PARSER = new com.google.protobuf.AbstractParser<Test>() {
            public Test parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new Test(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<Test> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<Test> getParserForType() {
            return PARSER;
        }

        public DbFileSources.Test getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_com_linio_sonarqube_source_db_Line_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_com_linio_sonarqube_source_db_Line_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_com_linio_sonarqube_source_db_Data_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_com_linio_sonarqube_source_db_Data_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_com_linio_sonarqube_source_db_Test_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_com_linio_sonarqube_source_db_Test_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_com_linio_sonarqube_source_db_Test_CoveredFile_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_com_linio_sonarqube_source_db_Test_CoveredFile_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor
    getDescriptor() {
        return descriptor;
    }
    private static  com.google.protobuf.Descriptors.FileDescriptor
            descriptor;
    static {
        java.lang.String[] descriptorData = {
                "\n@src/main/java/com/linio/sonarqube/prot" +
                        "obuf/db-file-sources.proto\022\035com.linio.so" +
                        "narqube.source.db\"\271\004\n\004Line\022\014\n\004line\030\001 \001(\005" +
                        "\022\016\n\006source\030\002 \001(\t\022\024\n\014scm_revision\030\003 \001(\t\022\022" +
                        "\n\nscm_author\030\004 \001(\t\022\020\n\010scm_date\030\005 \001(\003\022\037\n\027" +
                        "deprecated_ut_line_hits\030\006 \001(\005\022 \n\030depreca" +
                        "ted_ut_conditions\030\007 \001(\005\022(\n deprecated_ut" +
                        "_covered_conditions\030\010 \001(\005\022\037\n\027deprecated_" +
                        "it_line_hits\030\t \001(\005\022 \n\030deprecated_it_cond" +
                        "itions\030\n \001(\005\022(\n deprecated_it_covered_co",
                "nditions\030\013 \001(\005\022$\n\034deprecated_overall_lin" +
                        "e_hits\030\014 \001(\005\022%\n\035deprecated_overall_condi" +
                        "tions\030\r \001(\005\022-\n%deprecated_overall_covere" +
                        "d_conditions\030\016 \001(\005\022\024\n\014highlighting\030\017 \001(\t" +
                        "\022\017\n\007symbols\030\020 \001(\t\022\027\n\013duplication\030\021 \003(\005B\002" +
                        "\020\001\022\021\n\tline_hits\030\022 \001(\005\022\022\n\nconditions\030\023 \001(" +
                        "\005\022\032\n\022covered_conditions\030\024 \001(\005\":\n\004Data\0222\n" +
                        "\005lines\030\001 \003(\0132#.com.linio.sonarqube.sourc" +
                        "e.db.Line\"\334\002\n\004Test\022\014\n\004uuid\030\001 \001(\t\022\014\n\004name" +
                        "\030\002 \001(\t\022>\n\006status\030\003 \001(\0162..com.linio.sonar",
                "qube.source.db.Test.TestStatus\022\031\n\021execut" +
                        "ion_time_ms\030\004 \001(\003\022\022\n\nstacktrace\030\005 \001(\t\022\013\n" +
                        "\003msg\030\006 \001(\t\022E\n\014covered_file\030\007 \003(\0132/.com.l" +
                        "inio.sonarqube.source.db.Test.CoveredFil" +
                        "e\032:\n\013CoveredFile\022\021\n\tfile_uuid\030\001 \001(\t\022\030\n\014c" +
                        "overed_line\030\002 \003(\005B\002\020\001\"9\n\nTestStatus\022\006\n\002O" +
                        "K\020\001\022\013\n\007FAILURE\020\002\022\t\n\005ERROR\020\003\022\013\n\007SKIPPED\020\004" +
                        "B \n\034com.linio.sonarqube.protobufH\001"
        };
        com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
                new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
                    public com.google.protobuf.ExtensionRegistry assignDescriptors(
                            com.google.protobuf.Descriptors.FileDescriptor root) {
                        descriptor = root;
                        return null;
                    }
                };
        com.google.protobuf.Descriptors.FileDescriptor
                .internalBuildGeneratedFileFrom(descriptorData,
                        new com.google.protobuf.Descriptors.FileDescriptor[] {
                        }, assigner);
        internal_static_com_linio_sonarqube_source_db_Line_descriptor =
                getDescriptor().getMessageTypes().get(0);
        internal_static_com_linio_sonarqube_source_db_Line_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_com_linio_sonarqube_source_db_Line_descriptor,
                new java.lang.String[] { "Line", "Source", "ScmRevision", "ScmAuthor", "ScmDate", "DeprecatedUtLineHits", "DeprecatedUtConditions", "DeprecatedUtCoveredConditions", "DeprecatedItLineHits", "DeprecatedItConditions", "DeprecatedItCoveredConditions", "DeprecatedOverallLineHits", "DeprecatedOverallConditions", "DeprecatedOverallCoveredConditions", "Highlighting", "Symbols", "Duplication", "LineHits", "Conditions", "CoveredConditions", });
        internal_static_com_linio_sonarqube_source_db_Data_descriptor =
                getDescriptor().getMessageTypes().get(1);
        internal_static_com_linio_sonarqube_source_db_Data_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_com_linio_sonarqube_source_db_Data_descriptor,
                new java.lang.String[] { "Lines", });
        internal_static_com_linio_sonarqube_source_db_Test_descriptor =
                getDescriptor().getMessageTypes().get(2);
        internal_static_com_linio_sonarqube_source_db_Test_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_com_linio_sonarqube_source_db_Test_descriptor,
                new java.lang.String[] { "Uuid", "Name", "Status", "ExecutionTimeMs", "Stacktrace", "Msg", "CoveredFile", });
        internal_static_com_linio_sonarqube_source_db_Test_CoveredFile_descriptor =
                internal_static_com_linio_sonarqube_source_db_Test_descriptor.getNestedTypes().get(0);
        internal_static_com_linio_sonarqube_source_db_Test_CoveredFile_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_com_linio_sonarqube_source_db_Test_CoveredFile_descriptor,
                new java.lang.String[] { "FileUuid", "CoveredLine", });
    }

    // @@protoc_insertion_point(outer_class_scope)
}
