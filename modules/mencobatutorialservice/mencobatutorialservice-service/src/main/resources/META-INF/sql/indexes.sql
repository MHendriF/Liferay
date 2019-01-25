create index IX_BE710949 on GB_mencobatutorial (groupId);
create index IX_4BF2B035 on GB_mencobatutorial (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_CF63BFF7 on GB_mencobatutorial (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_2B9F927F on GB_mencobatutorialEntry (groupId, guestbookId);
create index IX_94E89071 on GB_mencobatutorialEntry (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_7F8C7F33 on GB_mencobatutorialEntry (uuid_[$COLUMN_LENGTH:75$], groupId);